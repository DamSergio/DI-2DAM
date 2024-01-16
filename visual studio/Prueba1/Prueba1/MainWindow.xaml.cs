using Prueba1.dto;
using System.Collections.ObjectModel;
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

namespace Prueba1
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        
        public ObservableCollection<Persona> personaList { get; set; }
        public MainWindow()
        {
            InitializeComponent();

            personaList = new ObservableCollection<Persona>();
            personaList.Add(new Persona("Sergio", "Ballesteros"));
            personaList.Add(new Persona("Tontoel", "Quelolea"));

            this.DataContext = this;
        }

        private void btnMostrar_Click(object sender, RoutedEventArgs e)
        {
            if (lbText.Visibility == Visibility.Visible)
            {
                lbText.Visibility = Visibility.Hidden;
            } 
            else
            {
                lbText.Visibility = Visibility.Visible;
            }
        }

        private void cbPersonas_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            ComboBoxItem item = (ComboBoxItem) cbPersonas.SelectedItem;
            Persona p = (Persona) item.Content;
            lbName.Content = p.nombre;
            lbApe.Content = p.apellidos;
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            personaList.Add(new Persona("Benito", "Camela"));
        }
    }
}