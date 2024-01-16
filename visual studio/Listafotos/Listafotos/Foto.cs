using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Listafotos
{
    public class Foto
    {

        public string ruta { get; set; }
        public Foto(string path)
        {
            ruta = path;
        }



        public override string ToString() {
            return ruta;
        }
    }
}
