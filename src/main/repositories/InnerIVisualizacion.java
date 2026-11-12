import org.springframework.stereotype.Repository;


     @Repository 
     public interface InnerIVisualizacion extends JpaRepository{
          // visualizaciones por fecha de visualización
    List<Visualizacion> findByFechaVisualizacion(LocalDate fecha);

    // visualizaciones sin completar
    List<Visualizacion> findByCompletadoFalse();

    // visualizaciones completadas
    List<Visualizacion> findByCompletadoTrue();
    
        
    }
     
        
    


