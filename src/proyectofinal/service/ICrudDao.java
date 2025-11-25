package proyectofinal.service;

public interface ICrudDao<T> {
    void agregar(T o);
    void modificar(T o);
    void eliminar(T o);
    T encontrar(Object o);
}
