   M S B A M L   `   `   `  ����P  LPractica_01_Unidad_05, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null=#clr-namespace:Practica_01_Unidad_05Practica_01_Unidad_05  5   	   0    *Practica_01_Unidad_05.DialogoCrearEmpleado   5   	   W SPresentationCore, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35\ XPresentationFramework, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35e aSystem.Windows.Controls.Ribbon, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089R NWindowsBase, Version=8.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35F 9http://schemas.microsoft.com/winfx/2006/xaml/presentation     5   	   R NSystem.Xaml, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	   @d2http://schemas.microsoft.com/expression/blend/2008     5   	   Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5   	   5local#clr-namespace:Practica_01_Unidad_05     5   	     � Title$  DialogoCrearEmpleado��5   	   $	��450��6&   $	��800��63   .��5	      �  � RowDefinitions 5
   
   �� 5      $
��Auto �6   �� 5      $��* �6   .+�5   
   �� $��Nombre��6   $
��Left=�6!   $��
183,39,0,0q�6<   $��1��6P   $	��Top=�6]   $	��178��6u   �� 5   
   -   5         ��Name$ 	txtNombre��5      $
��Left=�6%   $��
400,43,0,0q�6@   $��1��6T    �� TextWrapping$
 Wrap=�6a   $	��Top=�6�   $	��232��6  ��6�   ��  �� Path$ Nombre� �� NotifyOnValidationError$
 True�� �� ValidatesOnDataErrors$
 True��6  �� 5   
   $��	Apellidos��6   $
��Left=�6$   $��
183,70,0,0q�6?   $��1��6S   $	��Top=�6`    J� RenderTransformOrigin$ 0.884,-0.283&�6x   $	��178��6�   �� 5   
   -   5        $ txtApellidos��5      $
��Left=�6(   $��
400,70,0,0q�6C   $��1��6W   $
 Wrap=�6d   $	��Top=�6�   $	��232��6  ��6�   �� $ Apellido�$
 True��$
 True��6  �� 5   
   $��Puesto��6   $
��Left=�6!   $��183,101,0,0q�6<   $��1��6Q   $	��Top=�6^   $	��178��6v   �� 5   
   -   5        $ 	txtPuesto��5      $
��Left=�6%   $��400,101,0,0q�6@   $��1��6U   $
 Wrap=�6b   $	��Top=�6�   $	��232��6	  ��6�   �� $ Puesto�$
 True��$
 True��6	  �� 5   
   -   5         ��Name$ chkAlta��5      $
��Alta��6D   $
��Left=�6S   $��400,132,0,0q�6n   $��1��6�   $	��Top=�6�   $��13��6�   $	��232��6�   	 d� 	IsChecked	 6$   �� $
 Alta�6�   �� 5   
   -   5        
 ��Name$
 	btnImagen��5      $��Seleccionar imagen��6$   $
��Left=�6A   $��183,168,0,0q�6\   $��1��6q   $	��Top=�6~   $ -0.158,-1.981&�6�   $	��178��6�   6�   �� 5   
   -   5         ��Name$ imgEmpleado��5      $��Uniform=�6%   $
��Left=�67   $	��211��6R   $��183,200,0,0q�6_   $��2��6t   $	��Top=�6�   $	��189��6�   �� 5   
   -   5        $
 
btnAceptar��5      $��Aceptar��6%   $
��Left=�67   $��516,344,0,0q�6R   $��1��6g   $	��Top=�6t   $��34��6�   $	��116��6�   6�   �� 5   
   -   5        $
 btnCancelar��5      $��Cancelar��6&   $
��Left=�69   $��637,344,0,0q�6T   $��1��6i   $	��Top=�6v   $��34��6�   $	��116��6�   6�   �� 5   
   -	   5        $ 
txtRutaImg��5      $
��Left=�6&   $��400,168,0,0q�6A   $��1��6V   $
 Wrap=�6c   $	��Top=�6�   $	��232��6  $ 0.5,0.5&�6  $��18��6:  ��6�   �� $ 
RutaImagen�$
 True��$
 True��.��6F  5      5      5      