using ProyectoJuegos.dto;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProyectoJuegos.logic
{
    public class LogicLibro
    {
        public ObservableCollection<Libro> lista {  get; set; }

        public LogicLibro()
        {
            lista = new ObservableCollection<Libro>();
            lista.Add(new Libro("El señor de los añillos", "J.R.R. Tolkien", new DateTime(1954, 7, 29)));
        }

        public void nuevoLibro(Libro l)
        {
            lista.Add(l);
        }

        public void modificarLibro(Libro l, int pos)
        {
            lista[pos] = l;
        }

        public Libro getLibro(int pos)
        {
            return lista.ElementAt(pos);
        }

        public ObservableCollection<Libro> getLista()
        {
            return lista;
        }
    }
}
