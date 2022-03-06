package datetime.model;

import javax.persistence.Embeddable;
import java.util.Objects;

import static com.google.common.base.Preconditions.checkArgument;

@Embeddable
public class CityCode {

    private String code;

    protected CityCode() {
    }

    private CityCode(final String code) {
        checkArgument(code.length() == 3, "The city code must be 3 characters long");
        this.code = code;
    }

    public static CityCode of(final String code) {
        return new CityCode(code);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CityCode cityCode = (CityCode) o;
        return Objects.equals(code, cityCode.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}