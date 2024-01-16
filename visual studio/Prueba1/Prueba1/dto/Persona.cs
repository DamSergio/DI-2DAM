using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Prueba1.dto
{
    public class Persona
    {
        public String nombre { get; set; }
        public String apellidos { get; set; }

        public Persona(String nombre, String apellidos) { 
            this.nombre = nombre; 
            this.apellidos = apellidos; 
        }

        public override String ToString()
        {
            return nombre + " " + apellidos;
        }
    }
}
