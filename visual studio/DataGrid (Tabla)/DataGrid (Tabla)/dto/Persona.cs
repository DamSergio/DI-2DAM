using System;
using System.Collections.Generic;
using System.Collections.Specialized;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DataGrid__Tabla_.dto
{
    public class Persona : INotifyPropertyChanged
    {
        private String nombre;
        public String Nombre
        {
            get
            {
                return nombre;
            }
            set
            {
                this.nombre = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("nombre"));
            }
        }
        private String apellidos;
        public String Apellidos
        {
            get
            {
                return apellidos;
            }
            set
            {
                this.apellidos = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("apellidos"));
            }
        }

        public Persona(String nombre, String apellidos) { 
            this.nombre = nombre; 
            this.apellidos = apellidos; 
        }

        public event PropertyChangedEventHandler? PropertyChanged;

        public override String ToString()
        {
            return nombre + " " + apellidos;
        }
    }
}
