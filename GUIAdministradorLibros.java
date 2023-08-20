import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class GUIAdministradorLibros extends JFrame implements ActionListener {
    private JFrame frame;
    AdministradorLibros admin;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem agregarItem, eliminarItem, mostrarItem, salirItem;
    TextField tf;
    
    
    public GUIAdministradorLibros() {
        frame = new JFrame("Administrador de Libros");
        admin = new AdministradorLibros();
        
        menuBar = new JMenuBar();
        
        menu = new JMenu("Opciones");
        agregarItem = new JMenuItem("Agregar libro");
        eliminarItem = new JMenuItem("Eliminar libro por ISBN");
        mostrarItem = new JMenuItem("Mostrar todos los libros");
        salirItem = new JMenuItem("Salir del programa");
        
        agregarItem.addActionListener(this);
        eliminarItem.addActionListener(this);
        mostrarItem.addActionListener(this);
        salirItem.addActionListener(this);

        
        menu.add(agregarItem);
        menu.add(eliminarItem);
        menu.add(mostrarItem);
        menu.add(salirItem);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        
        agregarItem.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para agregar libro...
            }
        });
        
        eliminarItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para eliminar libro por ISBN...
            }
        });
        
        mostrarItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para mostrar todos los libros...
            }
        });

        salirItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para salir...
            }
        });
        
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		//TODO Auto-generated method stub
		if (e.getSource()== agregarItem) {
			String titulo = JOptionPane.showInputDialog(frame,
                    "Titulo: ", null);
			String autor = JOptionPane.showInputDialog(frame,
                    "Autor: ", null);
			String ISBN = JOptionPane.showInputDialog(frame,
                    "ISBN: ", null);
			Libro nuevoLibro = new Libro(titulo, autor, ISBN);
			admin.agregarLibro(nuevoLibro);
            JOptionPane.showMessageDialog(frame, "Se agregó al catálogo el libro con el ISBN " + ISBN);
			
		}
		if (e.getSource()== mostrarItem) { 
            tf = new TextField();
            
            String Catalogo = null;
            Catalogo = admin.mostrarLibros();
            //tf.setText(Catalogo);
            
            if(Catalogo == null){
               JOptionPane.showMessageDialog(frame, "No hay libros registrados"); 
            }else{
                
                JOptionPane.showMessageDialog(frame,"Listado de libros registrados : \n" + Catalogo);
                
            }
            
        }
			
		
		if (e.getSource()== eliminarItem) {
        boolean valida = false;
			String ISBN = JOptionPane.showInputDialog(frame,
                    "ISBN: ", null);
			valida = admin.eliminarLibroPorISBN(ISBN);
           
            if(valida != false){
                JOptionPane.showMessageDialog(frame, "Se eliminó del catálogo el libro con el ISBN " + ISBN);
                
            }
            else{
               JOptionPane.showMessageDialog(frame, "No hay un libro registrado con ese ISBN"); 
            }
            }
		
		
        if(e.getSource() == salirItem){
            frame.dispose();

        }
	}
  
}