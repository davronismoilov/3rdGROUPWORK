package uz.pdp.service.base;

public interface BaseService<T, L, P, D> {
    void add(T t);
    int sendSMS();
    L getList(P p);
    L getList();
    boolean check(D d);
    T get(D d);
    T get(D d1, D d2);
}
