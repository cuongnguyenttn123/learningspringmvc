package cuongnguyen.tt.model;

import java.io.Serializable;
import java.util.Random;
import java.util.stream.Stream;

import javafx.scene.control.RadioMenuItem;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
public class MyGenerator implements IdentifierGenerator {
    private String prefix = "";
    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object obj) throws HibernateException {
        Random random = new Random();
        Integer max = random.nextInt(8999);
        return prefix + (String.format("%04d", max + 1));
    }
}
