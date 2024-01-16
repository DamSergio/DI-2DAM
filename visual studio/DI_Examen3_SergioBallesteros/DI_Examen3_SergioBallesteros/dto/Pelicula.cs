using System.ComponentModel;

namespace DI_Examen3_SergioBallesteros.dto
{
    public class Pelicula : INotifyPropertyChanged, ICloneable, IDataErrorInfo
    {
        private string nombre;
        private bool visto;
        private string genero;
        private string rutaImg;
        private Reseña reseña;

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
        public bool Visto
        {
            get
            {
                return visto;
            }
            set
            {
                this.visto = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("Visto"));
            }
        }
        public string Genero
        {
            get
            {
                return genero;
            }
            set
            {
                this.genero = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("Genero"));
            }
        }
        public string RutaImg
        {
            get
            {
                return rutaImg;
            }
            set
            {
                this.rutaImg = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("RutaImg"));
            }
        }
        public Reseña Reseña
        {
            get
            {
                return reseña;
            }
            set
            {
                this.reseña = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("Reseña"));
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

                if (columnName == "Genero")
                {
                    if (string.IsNullOrEmpty(genero))
                        resultado = "El genero no puede estar vacío";
                }

                return resultado;
            }
        }

        public Pelicula() 
        {
            this.rutaImg = "https://cdn.pixabay.com/photo/2012/04/18/01/18/movie-36412_1280.png";
        }
        public Pelicula(string nombre, bool visto, string genero, string rutaImg, Reseña reseña)
        {
            this.nombre = nombre;
            this.visto = visto;
            this.genero = genero;
            this.rutaImg = rutaImg;
            this.reseña = reseña;
        }

        public event PropertyChangedEventHandler? PropertyChanged;

        public override string ToString()
        {
            return "";
        }

        public object Clone()
        {
            return this.MemberwiseClone();
        }
    }
}
