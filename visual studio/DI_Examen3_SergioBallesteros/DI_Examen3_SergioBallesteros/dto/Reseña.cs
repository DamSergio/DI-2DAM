using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static System.Runtime.InteropServices.JavaScript.JSType;

namespace DI_Examen3_SergioBallesteros.dto
{
    public class Reseña
    {
        public string reseña { get; set; }
        public string nota { get; set; }

        public Reseña() { }
        public Reseña(string reseña,  string nota)
        {
            this.reseña = reseña;
            this.nota = nota;
        }
    }
}
