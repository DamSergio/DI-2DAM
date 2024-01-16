using Plantillas.logica;
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

namespace Plantillas
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {

        private LogicaLibros logicaLibros;

        public MainWindow()
        {
            InitializeComponent();
            logicaLibros = new LogicaLibros();
            listboxlibros.DataContext = logicaLibros;
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            logicaLibros.nuevoLibro(new dto.Libro("Prueba", "Prueba", new DateTime(1997, 9, 8)));
        }
    }
}











/*<DataGridTemplateColumn Header="Imagen">
            <DataGridTemplateColumn.CellTemplate>
                <DataTemplate>
                    <Image Source="{Binding RutaImagen}" Width="50" Height="50"/>
                </DataTemplate>
            </DataGridTemplateColumn.CellTemplate>
        </DataGridTemplateColumn>
*/