using ProyectoJuegos.dto;
using ProyectoJuegos.logic;
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

namespace ProyectoJuegos
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        private LogicLibro logica;

        public MainWindow()
        {
            InitializeComponent();

            logica = new LogicLibro();
            tbLibros.DataContext = logica;
        }

        private void btnJuego_Click(object sender, RoutedEventArgs e)
        {
            Window1 dialog = new Window1(logica);
            dialog.Show();
        }

        private void btnCrear_Click(object sender, RoutedEventArgs e)
        {

        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            if (tbLibros.SelectedIndex == -1)
            {
                MessageBox.Show("Selecciona un libro");
                return;
            }

            Libro libro = (Libro) tbLibros.SelectedItem;
            int posicion = tbLibros.SelectedIndex;

            Window1 dialogo = new Window1(logica, (Libro) libro.Clone(), posicion);
            dialogo.Show();
        }
    }
}