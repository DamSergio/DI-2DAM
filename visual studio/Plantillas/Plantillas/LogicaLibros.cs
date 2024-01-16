using Plantillas.dto;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Plantillas.logica
{
    public class LogicaLibros
    {
        public ObservableCollection<Libro> listaLibros { get; set; }

        public LogicaLibros() { 
            listaLibros = new ObservableCollection<Libro>();
            listaLibros.Add(new Libro("El señor de los anillos", "J.R.R. Tolkien", new DateTime(1954, 7, 29)));
            listaLibros.Add(new Libro("Cien años de soledad", "Gabriel García Márquez", new DateTime(1967, 5, 30)));
            listaLibros.Add(new Libro("1984", "George Orwell", new DateTime(1949, 6, 8)));
        }

        public void nuevoLibro(Libro libro)
        {
            listaLibros.Add(libro);
        }


        public void modificarLibro(Libro libro, int pos)
        {
            listaLibros[pos] = libro;
        }
    }
}
