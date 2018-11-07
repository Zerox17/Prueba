import javax.swing.JOptionPane;

public class Principal
{
  public static void main (String agrs[])
  {
    
    int opc;
    do
    {
      opc=Integer.parseInt(JOptionPane.showInputDialog("1."
                                                         +"\n2."
                                                         +"\n3."
                                                         +"\n4."
                                                         +"\n5."
                                                         +"\n6."
                                                         +"\n7.Salir"));
      switch(opc)
      {
        case 1:
          ingresarEmpleado();
          break;
        case 2:
          break;
        case 3:
          break;
        case 4:
          break;
        case 5:
          break;
        case 6:
          break;
        case 7:
          break;
        default:
          JOptionPane.showInputDialog(null,"No existe esta opcion");
      }
    }while(opc!=7);
    
  }
  static public void ingresarEmpleado()
  {
    String nombre="";
    String categoria="";
    int cedula=0;
    Metodos metodos = new Metodos();
    
    nombre = JOptionPane.showInputDialog("Digite el nombre");
    categoria = JOptionPane.showInputDialog("Digite la categoria del empleado");
    cedula = Integer.parseInt(JOptionPane.showInputDialog("Digite la cedula"));
    
    Empleado empleado = new Empleado(nombre,categoria,cedula);
    
    metodos.agregarEmpleado(empleado);
  }//fin metodo agregar empleado
  
  public void agregarHoras()
  {
    int cedula=0;
    int dia=0;
    int horas=0;
    Metodos metodos = new Metodos();
    
    cedula = Integer.parseInt(JOptionPane.showInputDialog("Digite la cedula"));
    dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia"));
    horas = Integer.parseInt(JOptionPane.showInputDialog("Digite las horas trabajadas"));
    
    metodos.agregarHorasLaboradas(cedula, dia, horas);
  }//fin metodo agregar horas
  
}
