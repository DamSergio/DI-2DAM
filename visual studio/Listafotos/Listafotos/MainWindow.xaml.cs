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

namespace Listafotos
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {

        public ObservableCollection<Foto> ListaFotos { get; set; }

        public MainWindow()
        {
            InitializeComponent();

            ListaFotos = new ObservableCollection<Foto>();

            //Fotos
            ListaFotos.Add(new Foto(""));
            
            DataContext = this;
        }

        private void ListBox_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            labelselect.Content ="Elemento seleccionado: " + listafotos.SelectedIndex;
        }
    }
}