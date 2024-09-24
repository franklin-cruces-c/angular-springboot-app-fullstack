package gm.inventarios.repositorio;


import gm.inventarios.modelo.Producto;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface ProductoRepositorio extends JpaRepositoryImplementation <Producto,Integer> {

}
