using DI_Examen3_SergioBallesteros.dto;
using DI_Examen3_SergioBallesteros.logica;
using System.Text;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace DI_Examen3_SergioBallesteros
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        private PeliculaManager manager;
        public MainWindow()
        {
            InitializeComponent();

            manager = new PeliculaManager();
            listaPeli.DataContext = manager;
        }

        private void MenuItem_Click(object sender, RoutedEventArgs e)
        {
            CrearPelicula crearPelicula = new CrearPelicula(manager);
            crearPelicula.ShowDialog();
        }

        private void btnMod_Click(object sender, RoutedEventArgs e)
        {
            if (listaPeli.SelectedItem == null || listaPeli.SelectedIndex <= -1)
            {
                MessageBox.Show("Debe seleccionar una peli");
                return;
            }

            Pelicula p = (Pelicula) listaPeli.SelectedItem;
            CrearPelicula crearPelicula = new CrearPelicula(manager, (Pelicula) p.Clone(), listaPeli.SelectedIndex);
            crearPelicula.ShowDialog();
        }

        private void btnBorrar_Click(object sender, RoutedEventArgs e)
        {
            if (listaPeli.SelectedItem == null || listaPeli.SelectedIndex <= -1)
            {
                MessageBox.Show("Debe seleccionar una peli");
                return;
            }

            manager.borrarPelicula(listaPeli.SelectedIndex);
        }

        private void btnReseña_Click(object sender, RoutedEventArgs e)
        {
            if (listaPeli.SelectedItem == null || listaPeli.SelectedIndex <= -1)
            {
                MessageBox.Show("Debe seleccionar una peli");
                return;
            }

            Pelicula p = (Pelicula)listaPeli.SelectedItem;

            ReseñaDialog res = new ReseñaDialog(p, listaPeli.SelectedIndex, manager);
            res.ShowDialog();
        }
    }
}