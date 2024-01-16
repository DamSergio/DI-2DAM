using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Practica_01_Unidad_05.dto
{
    public class Empleado : INotifyPropertyChanged, IDataErrorInfo, ICloneable
    {
        private string nombre;
        private string apellido;
        private string puesto;
        private bool alta;
        private string rutaImagen;

        public string Nombre 
        {
            get
            {
                return nombre;
            }
            set
            {
                this.nombre = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("Nombre"));
            }
        }
        public string Apellido
        {
            get
            {
                return apellido;
            }
            set
            {
                this.apellido = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("Apellido"));
            }
        }
        public string Puesto
        {
            get
            {
                return puesto;
            }
            set
            {
                this.puesto = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("Puesto"));
            }
        }
        public bool Alta
        {
            get
            {
                return alta;
            }
            set
            {
                this.alta = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("Alta"));
            }
        }
        public string RutaImagen
        {
            get
            {
                return rutaImagen;
            }
            set
            {
                this.rutaImagen = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("RutaImagen"));
            }
        }

        public string Error
        {
            get
            {
                return "";
            }
        }

        public string this[string columnName]
        {
            get
            {
                string resultado = "";

                if (columnName == "Nombre")
                {
                    if (string.IsNullOrEmpty(nombre))
                        resultado = "El nombre no puede estar vacío";
                }

                if (columnName == "Apellido")
                {
                    if (string.IsNullOrEmpty(apellido))
                        resultado = "El apellido no puede estar vacío";
                }

                if (columnName == "Puesto")
                {
                    if (string.IsNullOrEmpty(puesto))
                        resultado = "El puesto no puede estar vacío";
                }

                if (columnName == "RutaImagen")
                {
                    if (string.IsNullOrEmpty(rutaImagen))
                        resultado = "La ruta de la imagen no puede estar vacía";
                }

                return resultado;
            }
        }

        public Empleado(string nombre, string apellido, string puesto, bool alta, string rutaImagen)
        {
            this.nombre = nombre;
            this.apellido = apellido;
            this.puesto = puesto;
            this.alta = alta;
            this.rutaImagen = rutaImagen;
        }

        public Empleado()
        {
            this.nombre = "";
            this.apellido = "";
            this.puesto = "";
            this.alta = false;
            this.rutaImagen = "";
        }

        public event PropertyChangedEventHandler? PropertyChanged;

        public object Clone()
        {
            return this.MemberwiseClone();
        }
    }
}
