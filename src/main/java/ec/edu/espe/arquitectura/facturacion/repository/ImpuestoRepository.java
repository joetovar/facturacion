package ec.edu.espe.arquitectura.facturacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.arquitectura.facturacion.model.Impuesto;

import java.util.List;

public interface ImpuestoRepository extends JpaRepository<Impuesto, String> {

    List<Impuesto> findByNombreLikeOrderByNombre(String nombrePattern);

}
