import javax.swing.JOptionPane;

public class Metodos
{
  int matrizHoras[][];//int por el tipo de valor que voy a guardar
  Empleado empleadosV[];
  Categoria categoriasV [];
  
  public Metodos()
  {
    //Es completamente necesario que se inicie de primero
    matrizHoras = new int[10][20];
    empleadosV = new Empleado[10];
    categoriasV = new Categoria[4];
  }
  
  public void agregarEmpleado (Empleado empleado)
  {
    boolean existe=false;
    for (int i=0; i < empleadosV.length; i++)
    {
      if(empleadosV[i]!=null)
      {
        if(empleadosV[i].getCedula()==empleado.getCedula())
        {
          existe=true;
        }
      }
    }
    if(existe==false)
    {
      for (int i=0; i < empleadosV.length; i++)
    {
      if(empleadosV[i]==null)
      {
        empleadosV[i]=empleado;
      }
     }
    }
    else
    {
      JOptionPane.showMessageDialog(null,"Ya existe un empleado con esta cedula");
    }
  }
  
  public void agregarHorasLaboradas(int cedula, int dia, int horas) //Resolver dudas
  {
    int posicion=0;
    boolean encontrado = false;
    
    if (horas<=10)
    {
      for (int i=0;i<empleadosV.length; i++)
      {
        if (empleadosV[i].getCedula()==cedula)
        {
          posicion = i;
          encontrado = true; 
        }
      }
    }
    else
    {
      JOptionPane.showMessageDialog(null, "La cantidad de horas excede las 10");
    }
    
    if (encontrado == true)
    {
      if (matrizHoras[posicion][dia]!=0)
      {
        
      }
      else 
      {
        
      }
    }
  }
}