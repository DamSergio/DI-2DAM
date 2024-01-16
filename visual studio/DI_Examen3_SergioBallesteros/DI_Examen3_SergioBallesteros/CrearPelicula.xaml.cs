using DI_Examen3_SergioBallesteros.dto;
using DI_Examen3_SergioBallesteros.logica;
using Microsoft.Win32;
using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
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
using static System.Runtime.InteropServices.JavaScript.JSType;

namespace DI_Examen3_SergioBallesteros
{
    /// <summary>
    /// Lógica de interacción para CrearPelicula.xaml
    /// </summary>
    public partial class CrearPelicula : Window
    {
        public ObservableCollection<string> generos;

        private PeliculaManager manager;
        private Pelicula peli;
        private bool modificar;
        private int index;
        private int errores = 0;

        public CrearPelicula()
        {
            InitializeComponent();
        }

        public CrearPelicula(PeliculaManager manager)
        {
            InitializeComponent();

            this.manager = manager;
            this.peli = new Pelicula();
            this.DataContext = peli;
            this.modificar = false;
        }

        public CrearPelicula(PeliculaManager manager, Pelicula p, int index)
        {
            InitializeComponent();

            this.manager = manager;
            this.peli = p;
            this.DataContext = peli;
            this.modificar = true;
            this.index = index;
        }

        private void btnCrear_Click(object sender, RoutedEventArgs e)
        {
            if (cbGenero.SelectedIndex == -1)
            {
                MessageBox.Show("Selecciona un genero");
                return;
            }

            if (modificar)
            {
                manager.modificarPelicula(peli, index);
            } 
            else
            {
                manager.agregarPelicula(peli);
            }

            this.Close();
        }

        private void btnCancelar_Click(object sender, RoutedEventArgs e)
        {
            this.Close();
        }

        private void btnImagen_Click(object sender, RoutedEventArgs e)
        {
            OpenFileDialog dialogo = new OpenFileDialog();

            if (dialogo.ShowDialog() == true)
            {
                string rutaImagen = dialogo.FileName;
                peli.RutaImg = rutaImagen;
            }
        }

        private void cbGenero_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            ComboBoxItem item = (ComboBoxItem)cbGenero.SelectedItem;
            string genero = (string) item.Content;

            peli.Genero = genero;
        }

        public void Validation_Error(object sender, ValidationErrorEventArgs e)
        {
            if (e.Action == ValidationErrorEventAction.Added)
            {
                errores++;
            }
            else
            {
                errores--;
            }

            if (errores == 0)
            {
                btnCrear.IsEnabled = true;
            }
            else
            {
                btnCrear.IsEnabled = false;
            }
        }
    }
}
