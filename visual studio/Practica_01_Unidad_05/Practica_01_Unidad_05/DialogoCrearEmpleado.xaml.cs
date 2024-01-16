using Microsoft.Win32;
using Practica_01_Unidad_05.dto;
using Practica_01_Unidad_05.logic;
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

namespace Practica_01_Unidad_05
{
    /// <summary>
    /// Lógica de interacción para DialogoCrearEmpleado.xaml
    /// </summary>
    public partial class DialogoCrearEmpleado : Window
    {
        private EmpleadoManager empleadoManager;
        private Empleado empleado;
        private String rutaImagen = "";
        private int errores = 0;
        private int index;
        private bool modificar;

        public DialogoCrearEmpleado()
        {
            InitializeComponent();
        }

        public DialogoCrearEmpleado(EmpleadoManager empleadoManager)
        {
            InitializeComponent();

            //btnAceptar.IsEnabled = false;
            this.empleadoManager = empleadoManager;
            this.empleado = new Empleado();
            this.DataContext = empleado;
            this.modificar = false;
        }

        public DialogoCrearEmpleado(EmpleadoManager empleadoManager, Empleado empleado, int index)
        {
            InitializeComponent();

            this.empleadoManager = empleadoManager;
            this.empleado = empleado;
            this.DataContext = empleado;
            this.modificar = true;
            this.index = index;

            imgEmpleado.Source = new BitmapImage(new Uri(empleado.RutaImagen));
        }

        private void btnImagen_Click(object sender, RoutedEventArgs e)
        {
            OpenFileDialog dialogo = new OpenFileDialog();

            if (dialogo.ShowDialog() == true)
            {
                rutaImagen = dialogo.FileName;
                imgEmpleado.Source = new BitmapImage(new Uri(rutaImagen));
                txtRutaImg.Text = rutaImagen;
                empleado.RutaImagen = rutaImagen;
            }
        }

        private void btnCancelar_Click(object sender, RoutedEventArgs e)
        {
            this.Close();
        }

        private void btnAceptar_Click(object sender, RoutedEventArgs e)
        {
            if (modificar)
            {
                empleadoManager.ModificarEmpleado(empleado, index);
            }
            else
            {
                empleadoManager.AgregarEmpleado(empleado);
            }
            this.Close();
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
                btnAceptar.IsEnabled = true;
            }
            else
            {
                btnAceptar.IsEnabled = false;
            }
        }
    }
}
