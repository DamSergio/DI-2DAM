using DataGrid__Tabla_.dto;
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

namespace DataGrid__Tabla_
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public ObservableCollection<Persona> personas { get; set; }

        public MainWindow()
        {
            InitializeComponent();

            personas = new ObservableCollection<Persona>();

            personas.Add(new Persona("Benito","Camela"));
            personas.Add(new Persona("Mariam", "Pajote"));
            personas.Add(new Persona("Cyndi", "Entes"));

            this.DataContext = this;
        }

        private void btnAccept_Click(object sender, RoutedEventArgs e)
        {
            personas.Add(new Persona(txtName.Text, txtApe.Text));
        }

        private void btnDel_Click(object sender, RoutedEventArgs e)
        {
            int row = tbPersonas.SelectedIndex;
            personas.RemoveAt(row);
        }

        private void btnUpdate_Click(object sender, RoutedEventArgs e)
        {
            int row = tbPersonas.SelectedIndex;

            personas.ElementAt(row).Nombre = txtName.Text;
            personas.ElementAt(row).Apellidos = txtApe.Text;
        }
    }
}