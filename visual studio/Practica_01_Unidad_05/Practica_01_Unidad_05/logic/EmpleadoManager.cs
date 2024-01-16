using Practica_01_Unidad_05.dto;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Practica_01_Unidad_05.logic
{
    public class EmpleadoManager
    {
        public ObservableCollection<Empleado> listaEmpleados { get; set; }

        public EmpleadoManager()
        {
            listaEmpleados = new ObservableCollection<Empleado>();
        }

        public void AgregarEmpleado(Empleado empleado)
        {
            listaEmpleados.Add(empleado);
        }

        public void ModificarEmpleado(Empleado empleado, int index)
        {   
            listaEmpleados[index] = empleado;
        }

        public void EleminarEmpleado(int index)
        {
            listaEmpleados.RemoveAt(index);
        }
    }
}
