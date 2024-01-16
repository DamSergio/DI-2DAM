using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Controls;

namespace Plantillas.dto
{
    public class Libro : INotifyPropertyChanged, ICloneable, IDataErrorInfo
    {
        private string titulo;
        public string Titulo
        {
            get
            {
                return titulo;
            }
            set
            {
                titulo = value;
                PropertyChanged(this, new PropertyChangedEventArgs("Titulo"));

            }
        }

        private string autor;
        public string Autor
        {
            get
            {
                return autor;
            }
            set
            {
                autor = value;
                PropertyChanged(this, new PropertyChangedEventArgs("Autor"));
            }
        }

        private DateTime fechaCreacion;
        public DateTime FechaCreacion
        {
            get
            {
                return fechaCreacion;
            }
            set
            {
                fechaCreacion = value;
                PropertyChanged(this, new PropertyChangedEventArgs("FechaCreacion"));

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
                        resultado = "Debe tener un título";
                }

                if (columnName == "Autor")
                {
                    if (string.IsNullOrEmpty(autor))
                        resultado = "Debe tener un autor";
                }
                return resultado;
            }
        }

        public Libro(string titulo, string autor, DateTime fechaCreacion)
        {
            this.titulo = titulo;
            this.autor = autor;
            this.fechaCreacion = fechaCreacion;
        }

        public Libro()
        {
            fechaCreacion = DateTime.Now;
        }


        public event PropertyChangedEventHandler PropertyChanged;

        public object Clone()
        {
            return MemberwiseClone();
        }


    }

}
