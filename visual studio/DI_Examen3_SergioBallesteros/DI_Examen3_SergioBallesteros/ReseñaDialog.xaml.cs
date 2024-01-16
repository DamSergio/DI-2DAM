using DI_Examen3_SergioBallesteros.dto;
using DI_Examen3_SergioBallesteros.logica;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;

namespace DI_Examen3_SergioBallesteros
{
    /// <summary>
    /// Lógica de interacción para ReseñaDialog.xaml
    /// </summary>
    public partial class ReseñaDialog : Window
    {
        public Pelicula pelicula;
        public int index;
        public PeliculaManager manager;
        public Reseña res;

        public ReseñaDialog()
        {
            InitializeComponent();
        }

        public ReseñaDialog(Pelicula p, int index, PeliculaManager manager)
        {
            InitializeComponent();

            this.index = index;
            this.manager = manager;

            this.pelicula = p;
            if (pelicula.Reseña == null )
            {
                this.pelicula.Reseña = new Reseña();
            }
            
            this.DataContext = pelicula.Reseña;
        }

        private void ComboBox_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            ComboBoxItem item = (ComboBoxItem)cbNota.SelectedItem;
            string nota = (string)item.Content;

            this.pelicula.Reseña.nota = nota;
        }

        private void btnSalir_Click(object sender, RoutedEventArgs e)
        {
            if (cbNota.SelectedIndex == -1)
            {
                MessageBox.Show("Debe seleccionar una nota");
                return;
            }

            res = pelicula.Reseña;
            manager.actualizarRes(res, index);

            this.Close();
        }
    }
}
