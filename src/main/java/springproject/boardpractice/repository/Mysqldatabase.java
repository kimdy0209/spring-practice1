package springproject.boardpractice.repository;

/*public class Mysqldatabase implements CustomerRepository{

    private final EntityManager em;

    public Mysqldatabase(EntityManager em) {
        this.em = em;
    }

    @Override
    public Customer save(Customer customer) {
        em.persist(customer);
        return customer;
    }

    @Override
    public Optional<Customer> findById(Long id) {
        Customer customer = em.find(Customer.class,id);
        return Optional.ofNullable(customer);
    }

    @Override
    public Optional<Customer> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<Customer> findAll() {
        return null;
    }
}*/
