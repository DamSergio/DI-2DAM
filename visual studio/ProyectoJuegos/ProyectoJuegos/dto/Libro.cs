using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProyectoJuegos.dto
{
    public class Libro : INotifyPropertyChanged, ICloneable, IDataErrorInfo
    {
        private String titulo;
        private String autor;
        private DateTime fecha;

        public String Titulo
        {
            get
            {
                return titulo;
            }
            set
            {
                this.titulo = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("titulo"));
            }
        }
        public String Autor
        {
            get
            {
                return autor;
            }
            set
            {
                this.autor = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("autor"));
            }
        } 
        public DateTime Fecha
        {
            get
            {
                return fecha;
            }
            set
            {
                this.fecha = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("fecha"));
            }
        }

        public string Error
        {
            get { return ""; }
        }

        public string this[string columnName]
        {
            get
            {
                string resultado = "";

                if (columnName == "Titulo")
                {
                    if (string.IsNullOrEmpty(titulo))
                        resultado = "Debe tener un titulo";
                }

                if (columnName == "Autor")
                {
                    if (string.IsNullOrEmpty(autor))
                        resultado = "Debe tener un autor";
                }

                return resultado;
            }
        }

        public Libro(String titulo, String autor, DateTime fecha)
        {
            this.titulo = titulo;
            this.autor = autor;
            this.fecha = fecha;
        }

        public Libro()
        {
            this.fecha = DateTime.Now;
        }

        public override string ToString()
        {
            return titulo + " " + autor;
        }

        public object Clone()
        {
            return this.MemberwiseClone();
        }

        public event PropertyChangedEventHandler? PropertyChanged;
    }
}
