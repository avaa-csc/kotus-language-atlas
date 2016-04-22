package fi.csc.avaa.kotus.kielikartastot.db.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Ryhma service. Represents a row in the &quot;ryhma&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link fi.csc.avaa.kotus.kielikartastot.db.model.impl.RyhmaModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link fi.csc.avaa.kotus.kielikartastot.db.model.impl.RyhmaImpl}.
 * </p>
 *
 * @author CSC
 * @see Ryhma
 * @see fi.csc.avaa.kotus.kielikartastot.db.model.impl.RyhmaImpl
 * @see fi.csc.avaa.kotus.kielikartastot.db.model.impl.RyhmaModelImpl
 * @generated
 */
public interface RyhmaModel extends BaseModel<Ryhma> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a ryhma model instance should use the {@link Ryhma} interface instead.
     */

    /**
     * Returns the primary key of this ryhma.
     *
     * @return the primary key of this ryhma
     */
    public int getPrimaryKey();

    /**
     * Sets the primary key of this ryhma.
     *
     * @param primaryKey the primary key of this ryhma
     */
    public void setPrimaryKey(int primaryKey);

    /**
     * Returns the ryhma_id of this ryhma.
     *
     * @return the ryhma_id of this ryhma
     */
    public int getRyhma_id();

    /**
     * Sets the ryhma_id of this ryhma.
     *
     * @param ryhma_id the ryhma_id of this ryhma
     */
    public void setRyhma_id(int ryhma_id);

    /**
     * Returns the aineisto_id of this ryhma.
     *
     * @return the aineisto_id of this ryhma
     */
    public int getAineisto_id();

    /**
     * Sets the aineisto_id of this ryhma.
     *
     * @param aineisto_id the aineisto_id of this ryhma
     */
    public void setAineisto_id(int aineisto_id);

    /**
     * Returns the nimi of this ryhma.
     *
     * @return the nimi of this ryhma
     */
    @AutoEscape
    public String getNimi();

    /**
     * Sets the nimi of this ryhma.
     *
     * @param nimi the nimi of this ryhma
     */
    public void setNimi(String nimi);

    /**
     * Returns the tyyppi of this ryhma.
     *
     * @return the tyyppi of this ryhma
     */
    @AutoEscape
    public String getTyyppi();

    /**
     * Sets the tyyppi of this ryhma.
     *
     * @param tyyppi the tyyppi of this ryhma
     */
    public void setTyyppi(String tyyppi);

    /**
     * Returns the ylaryhma of this ryhma.
     *
     * @return the ylaryhma of this ryhma
     */
    public int getYlaryhma();

    /**
     * Sets the ylaryhma of this ryhma.
     *
     * @param ylaryhma the ylaryhma of this ryhma
     */
    public void setYlaryhma(int ylaryhma);

    /**
     * Returns the selite of this ryhma.
     *
     * @return the selite of this ryhma
     */
    @AutoEscape
    public String getSelite();

    /**
     * Sets the selite of this ryhma.
     *
     * @param selite the selite of this ryhma
     */
    public void setSelite(String selite);

    /**
     * Returns the kartta_kuva_linkki of this ryhma.
     *
     * @return the kartta_kuva_linkki of this ryhma
     */
    @AutoEscape
    public String getKartta_kuva_linkki();

    /**
     * Sets the kartta_kuva_linkki of this ryhma.
     *
     * @param kartta_kuva_linkki the kartta_kuva_linkki of this ryhma
     */
    public void setKartta_kuva_linkki(String kartta_kuva_linkki);

    /**
     * Returns the tuotu_kantaan of this ryhma.
     *
     * @return the tuotu_kantaan of this ryhma
     */
    public Date getTuotu_kantaan();

    /**
     * Sets the tuotu_kantaan of this ryhma.
     *
     * @param tuotu_kantaan the tuotu_kantaan of this ryhma
     */
    public void setTuotu_kantaan(Date tuotu_kantaan);

    /**
     * Returns the muutettu of this ryhma.
     *
     * @return the muutettu of this ryhma
     */
    public Date getMuutettu();

    /**
     * Sets the muutettu of this ryhma.
     *
     * @param muutettu the muutettu of this ryhma
     */
    public void setMuutettu(Date muutettu);

    /**
     * Returns the muuttaja of this ryhma.
     *
     * @return the muuttaja of this ryhma
     */
    @AutoEscape
    public String getMuuttaja();

    /**
     * Sets the muuttaja of this ryhma.
     *
     * @param muuttaja the muuttaja of this ryhma
     */
    public void setMuuttaja(String muuttaja);

    /**
     * Returns the poistettu of this ryhma.
     *
     * @return the poistettu of this ryhma
     */
    public Date getPoistettu();

    /**
     * Sets the poistettu of this ryhma.
     *
     * @param poistettu the poistettu of this ryhma
     */
    public void setPoistettu(Date poistettu);

    /**
     * Returns the tmp of this ryhma.
     *
     * @return the tmp of this ryhma
     */
    @AutoEscape
    public String getTmp();

    /**
     * Sets the tmp of this ryhma.
     *
     * @param tmp the tmp of this ryhma
     */
    public void setTmp(String tmp);

    /**
     * Returns the tunnus of this ryhma.
     *
     * @return the tunnus of this ryhma
     */
    @AutoEscape
    public String getTunnus();

    /**
     * Sets the tunnus of this ryhma.
     *
     * @param tunnus the tunnus of this ryhma
     */
    public void setTunnus(String tunnus);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(Ryhma ryhma);

    @Override
    public int hashCode();

    @Override
    public CacheModel<Ryhma> toCacheModel();

    @Override
    public Ryhma toEscapedModel();

    @Override
    public Ryhma toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}