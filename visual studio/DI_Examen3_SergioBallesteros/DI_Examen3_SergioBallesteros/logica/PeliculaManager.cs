using DI_Examen3_SergioBallesteros.dto;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DI_Examen3_SergioBallesteros.logica
{
    public class PeliculaManager
    {
        public ObservableCollection<Pelicula> peliculas { get; set; }

        public PeliculaManager() 
        {
            this.peliculas = new ObservableCollection<Pelicula>();
        }

        public void agregarPelicula(Pelicula pelicula)
        {
            this.peliculas.Add(pelicula);
        }

        public void modificarPelicula(Pelicula p, int index)
        {
            peliculas[index] = p;
        }

        public void borrarPelicula(int index)
        {
            peliculas.RemoveAt(index);
        }

        public void actualizarRes(Reseña res, int index)
        {

        }
    }
}
