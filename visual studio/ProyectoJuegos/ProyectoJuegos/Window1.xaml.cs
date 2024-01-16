using ProyectoJuegos.dto;
using ProyectoJuegos.logic;
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

namespace ProyectoJuegos
{
    /// <summary>
    /// Lógica de interacción para Window1.xaml
    /// </summary>
    public partial class Window1 : Window
    {
        private LogicLibro logic;
        public Libro libro;
        private int posicion;
        private bool modificar;
        private int errores = 0;

        public Window1()
        {
            InitializeComponent();
        }

        public Window1(LogicLibro logic)
        {
            InitializeComponent();
            this.logic = logic;
            libro = new Libro();

            this.DataContext = libro;
            modificar = false;
        }

        public Window1 (LogicLibro logic, Libro libro, int posicion)
        {
            InitializeComponent();
            this.logic = logic;
            this.libro = libro;
            this.posicion = posicion;

            this.DataContext = libro;
            modificar = true;
        }

        private void btnAceptar_Click(object sender, RoutedEventArgs e)
        {
            if (modificar)
            {
                this.logic.modificarLibro(libro, posicion);
            }
            else
            {
                this.logic.nuevoLibro(libro);
            }
            this.Close();
        }

        private void btnCancelar_Click(object sender, RoutedEventArgs e)
        {
            this.Close();
        }

        private void Validation_Error(object sender, ValidationErrorEventArgs e)
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
