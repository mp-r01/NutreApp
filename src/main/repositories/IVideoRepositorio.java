public interface IVideoRepositorio {
    @Repository
    public interface InnerIVideoRepositorio extends JpaRepository{
        //buscar videos por categoriia 
        //buscar videos por titulo(que ignore si esta en mayuscula o minuscula)
        //buscar un video por descripcion (contenga pedazos)
        //buscar videos por url
        //buscar videos por titulo y categoria

        //consultas en tabla vizualizacion
        //buscar visualizaciones por fecha de visualizacion
        //buscar visualizaciones sin completar 
        //buscar visualizaciones completadas 

        
    List<Video> findByCategoria(CategoriaVideo categoria);

    // buscar videos por título, ignorando mayúsculas y minúsculas
    List<Video> findByTituloIgnoreCase(String titulo);

    // buscar un video por descripción (contiene un pedazo del texto)
    Optional<Video> findFirstByDescripcionContainingIgnoreCase(String fragmento);

    // buscar videos por url
    List<Video> findByUrl(String url);

    // buscar videos por título y categoría
    List<Video> findByTituloIgnoreCaseAndCategoria(String titulo, CategoriaVideo categoria);

        
    
        
    }
}
