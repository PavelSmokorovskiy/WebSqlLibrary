package springlibrary.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import springlibrary.dao.interfaces.GenreDAO;
import springlibrary.entities.Genre;

import java.util.List;

@Component
public class GenreDAOImpl implements GenreDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Genre> getGenres() {
        return sessionFactory.getCurrentSession().createCriteria(Genre.class).list();
    }

}
