
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "datos")
@NamedQueries({
    @NamedQuery(name = "Datos.findAll", query = "SELECT d FROM Datos d"),
    @NamedQuery(name = "Datos.findByIdPostre", query = "SELECT d FROM Datos d WHERE d.idPostre = :idPostre"),
    @NamedQuery(name = "Datos.findByNombre", query = "SELECT d FROM Datos d WHERE d.nombre = :nombre"),
    @NamedQuery(name = "Datos.findByDescripcion", query = "SELECT d FROM Datos d WHERE d.descripcion = :descripcion"),
    @NamedQuery(name = "Datos.findByStock", query = "SELECT d FROM Datos d WHERE d.stock = :stock"),
    @NamedQuery(name = "Datos.findByPrecio", query = "SELECT d FROM Datos d WHERE d.precio = :precio"),
    @NamedQuery(name = "Datos.findByCategoria", query = "SELECT d FROM Datos d WHERE d.categoria = :categoria")})
public class Datos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_postre")
    private Integer idPostre;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "stock")
    private int stock;
    @Basic(optional = false)
    @Column(name = "precio")
    private float precio;
    @Basic(optional = false)
    @Column(name = "categoria")
    private String categoria;

    public Datos() {
    }

    public Datos(Integer idPostre) {
        this.idPostre = idPostre;
    }

    public Datos(Integer idPostre, String nombre, String descripcion, int stock, float precio, String categoria) {
        this.idPostre = idPostre;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
        this.categoria = categoria;
    }

    public Integer getIdPostre() {
        return idPostre;
    }

    public void setIdPostre(Integer idPostre) {
        this.idPostre = idPostre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPostre != null ? idPostre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Datos)) {
            return false;
        }
        Datos other = (Datos) object;
        if ((this.idPostre == null && other.idPostre != null) || (this.idPostre != null && !this.idPostre.equals(other.idPostre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Datos[ idPostre=" + idPostre + " ]";
    }

}
