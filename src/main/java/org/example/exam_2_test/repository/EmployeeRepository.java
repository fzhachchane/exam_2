package org.example.exam_2_test.repository;


import org.example.exam_2_test.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>

    @Autowired
    private EntityManager entityManager;

    public List<Employee> getAll() {
        Query query = entityManager.createQuery("SELECT e FROM Employee e");
        return query.getResultList();
    }

    public Employee findEmployeeById(int id) {
        return entityManager.find(Employee.class, id);
    }

    public void addEmployee(Employee employee) {
        entityManager.getTransaction().begin();
        entityManager.persist(employee);
        entityManager.getTransaction().commit();
    }

    public void updateEmployee(Employee employee) {
        entityManager.getTransaction().begin();
        entityManager.merge(employee);
        entityManager.getTransaction().commit();
    }

    public void deleteEmployee(Employee employee) {
        entityManager.getTransaction().begin();
        entityManager.remove(employee);
        entityManager.getTransaction().commit();
    }
}
