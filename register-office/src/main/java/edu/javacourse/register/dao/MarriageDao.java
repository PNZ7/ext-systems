package edu.javacourse.register.dao;

import edu.javacourse.register.domain.MarriageCertificate;
import edu.javacourse.register.view.MarriageRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;


public class MarriageDao {

    private static Logger LOGGER = LoggerFactory.getLogger(MarriageDao.class);

    private EntityManager entityManager;
    private String test;

    public void setTest(String test) {
        this.test = test;
    }

    //TODO доделать по аналогии с персон дао только под брачные сертификаты
    public MarriageCertificate findMarriageCertificate(MarriageRequest request) {
        LOGGER.info("findMarriageCertificate called:{}", test);

        return null;
    }
}
