using Practica_01_Unidad_05.dto;
using Practica_01_Unidad_05.logic;
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

namespace Practica_01_Unidad_05
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        private EmpleadoManager empleadoManager;
        public MainWindow()
        {
            InitializeComponent();

            empleadoManager = new EmpleadoManager();
            tbEmpleados.DataContext = empleadoManager;
        }

        private void btnCrearEmpleado_Click(object sender, RoutedEventArgs e)
        {
            DialogoCrearEmpleado dialogo = new DialogoCrearEmpleado(empleadoManager);
            dialogo.ShowDialog();
        }

        private void btnModificar_Click(object sender, RoutedEventArgs e)
        {
            if (tbEmpleados.SelectedIndex <= -1 || empleadoManager.listaEmpleados.Count == 0)
            {
                MessageBox.Show("Debe seleccionar un empleado");
                return;
            }

            Empleado empleado = (Empleado)tbEmpleados.SelectedItem;
            DialogoCrearEmpleado dialogo = new DialogoCrearEmpleado(empleadoManager, (Empleado) empleado.Clone(), tbEmpleados.SelectedIndex);
            dialogo.ShowDialog();
        }

        private void btnBorarr_Click(object sender, RoutedEventArgs e)
        {
            if (tbEmpleados.SelectedIndex <= -1 || empleadoManager.listaEmpleados.Count == 0)
            {
                MessageBox.Show("Debe seleccionar un empleado");
                return;
            }

            empleadoManager.EleminarEmpleado(tbEmpleados.SelectedIndex);
        }
    }
}