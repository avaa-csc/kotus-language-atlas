package fi.csc.avaa.kotus.kielikartastot.db.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Paikka service. Represents a row in the &quot;paikka&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link fi.csc.avaa.kotus.kielikartastot.db.model.impl.PaikkaModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link fi.csc.avaa.kotus.kielikartastot.db.model.impl.PaikkaImpl}.
 * </p>
 *
 * @author CSC
 * @see Paikka
 * @see fi.csc.avaa.kotus.kielikartastot.db.model.impl.PaikkaImpl
 * @see fi.csc.avaa.kotus.kielikartastot.db.model.impl.PaikkaModelImpl
 * @generated
 */
public interface PaikkaModel extends BaseModel<Paikka> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a paikka model instance should use the {@link Paikka} interface instead.
     */

    /**
     * Returns the primary key of this paikka.
     *
     * @return the primary key of this paikka
     */
    public int getPrimaryKey();

    /**
     * Sets the primary key of this paikka.
     *
     * @param primaryKey the primary key of this paikka
     */
    public void setPrimaryKey(int primaryKey);

    /**
     * Returns the paikka_id of this paikka.
     *
     * @return the paikka_id of this paikka
     */
    public int getPaikka_id();

    /**
     * Sets the paikka_id of this paikka.
     *
     * @param paikka_id the paikka_id of this paikka
     */
    public void setPaikka_id(int paikka_id);

    /**
     * Returns the aineistot of this paikka.
     *
     * @return the aineistot of this paikka
     */
    @AutoEscape
    public String getAineistot();

    /**
     * Sets the aineistot of this paikka.
     *
     * @param aineistot the aineistot of this paikka
     */
    public void setAineistot(String aineistot);

    /**
     * Returns the tunniste of this paikka.
     *
     * @return the tunniste of this paikka
     */
    @AutoEscape
    public String getTunniste();

    /**
     * Sets the tunniste of this paikka.
     *
     * @param tunniste the tunniste of this paikka
     */
    public void setTunniste(String tunniste);

    /**
     * Returns the nimi_fin of this paikka.
     *
     * @return the nimi_fin of this paikka
     */
    @AutoEscape
    public String getNimi_fin();

    /**
     * Sets the nimi_fin of this paikka.
     *
     * @param nimi_fin the nimi_fin of this paikka
     */
    public void setNimi_fin(String nimi_fin);

    /**
     * Returns the nimi_kieli of this paikka.
     *
     * @return the nimi_kieli of this paikka
     */
    @AutoEscape
    public String getNimi_kieli();

    /**
     * Sets the nimi_kieli of this paikka.
     *
     * @param nimi_kieli the nimi_kieli of this paikka
     */
    public void setNimi_kieli(String nimi_kieli);

    /**
     * Returns the tyyppi of this paikka.
     *
     * @return the tyyppi of this paikka
     */
    @AutoEscape
    public String getTyyppi();

    /**
     * Sets the tyyppi of this paikka.
     *
     * @param tyyppi the tyyppi of this paikka
     */
    public void setTyyppi(String tyyppi);

    /**
     * Returns the alue of this paikka.
     *
     * @return the alue of this paikka
     */
    @AutoEscape
    public String getAlue();

    /**
     * Sets the alue of this paikka.
     *
     * @param alue the alue of this paikka
     */
    public void setAlue(String alue);

    /**
     * Returns the maa_ i s o3166_1 of this paikka.
     *
     * @return the maa_ i s o3166_1 of this paikka
     */
    @AutoEscape
    public String getMaa_ISO3166_1();

    /**
     * Sets the maa_ i s o3166_1 of this paikka.
     *
     * @param maa_ISO3166_1 the maa_ i s o3166_1 of this paikka
     */
    public void setMaa_ISO3166_1(String maa_ISO3166_1);

    /**
     * Returns the ajankohta of this paikka.
     *
     * @return the ajankohta of this paikka
     */
    @AutoEscape
    public String getAjankohta();

    /**
     * Sets the ajankohta of this paikka.
     *
     * @param ajankohta the ajankohta of this paikka
     */
    public void setAjankohta(String ajankohta);

    /**
     * Returns the selite of this paikka.
     *
     * @return the selite of this paikka
     */
    @AutoEscape
    public String getSelite();

    /**
     * Sets the selite of this paikka.
     *
     * @param selite the selite of this paikka
     */
    public void setSelite(String selite);

    /**
     * Returns the kielet of this paikka.
     *
     * @return the kielet of this paikka
     */
    @AutoEscape
    public String getKielet();

    /**
     * Sets the kielet of this paikka.
     *
     * @param kielet the kielet of this paikka
     */
    public void setKielet(String kielet);

    /**
     * Returns the murre of this paikka.
     *
     * @return the murre of this paikka
     */
    @AutoEscape
    public String getMurre();

    /**
     * Sets the murre of this paikka.
     *
     * @param murre the murre of this paikka
     */
    public void setMurre(String murre);

    /**
     * Returns the sapo_linkki of this paikka.
     *
     * @return the sapo_linkki of this paikka
     */
    @AutoEscape
    public String getSapo_linkki();

    /**
     * Sets the sapo_linkki of this paikka.
     *
     * @param sapo_linkki the sapo_linkki of this paikka
     */
    public void setSapo_linkki(String sapo_linkki);

    /**
     * Returns the mml_paikka i d of this paikka.
     *
     * @return the mml_paikka i d of this paikka
     */
    public int getMml_paikkaID();

    /**
     * Sets the mml_paikka i d of this paikka.
     *
     * @param mml_paikkaID the mml_paikka i d of this paikka
     */
    public void setMml_paikkaID(int mml_paikkaID);

    /**
     * Returns the tuotu_kantaan of this paikka.
     *
     * @return the tuotu_kantaan of this paikka
     */
    public Date getTuotu_kantaan();

    /**
     * Sets the tuotu_kantaan of this paikka.
     *
     * @param tuotu_kantaan the tuotu_kantaan of this paikka
     */
    public void setTuotu_kantaan(Date tuotu_kantaan);

    /**
     * Returns the muutettu of this paikka.
     *
     * @return the muutettu of this paikka
     */
    public Date getMuutettu();

    /**
     * Sets the muutettu of this paikka.
     *
     * @param muutettu the muutettu of this paikka
     */
    public void setMuutettu(Date muutettu);

    /**
     * Returns the muuttaja of this paikka.
     *
     * @return the muuttaja of this paikka
     */
    @AutoEscape
    public String getMuuttaja();

    /**
     * Sets the muuttaja of this paikka.
     *
     * @param muuttaja the muuttaja of this paikka
     */
    public void setMuuttaja(String muuttaja);

    /**
     * Returns the poistettu of this paikka.
     *
     * @return the poistettu of this paikka
     */
    public Date getPoistettu();

    /**
     * Sets the poistettu of this paikka.
     *
     * @param poistettu the poistettu of this paikka
     */
    public void setPoistettu(Date poistettu);

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
    public int compareTo(Paikka paikka);

    @Override
    public int hashCode();

    @Override
    public CacheModel<Paikka> toCacheModel();

    @Override
    public Paikka toEscapedModel();

    @Override
    public Paikka toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}