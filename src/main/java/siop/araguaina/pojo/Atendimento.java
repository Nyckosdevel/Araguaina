package siop.araguaina.pojo;
// Generated 21/08/2015 15:52:52 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Atendimento generated by hbm2java
 */
@Entity
@Table(name="atendimento"
    ,catalog="ocorrencia"
)
public class Atendimento  implements java.io.Serializable {


     private AtendimentoId id;
     private Dados dados;
     private int naturezaId;
     private int naturezaGrupoId;
     private Set registros = new HashSet(0);

    public Atendimento() {
    }

	
    public Atendimento(AtendimentoId id, Dados dados, int naturezaId, int naturezaGrupoId) {
        this.id = id;
        this.dados = dados;
        this.naturezaId = naturezaId;
        this.naturezaGrupoId = naturezaGrupoId;
    }
    public Atendimento(AtendimentoId id, Dados dados, int naturezaId, int naturezaGrupoId, Set registros) {
       this.id = id;
       this.dados = dados;
       this.naturezaId = naturezaId;
       this.naturezaGrupoId = naturezaGrupoId;
       this.registros = registros;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="protocolo", column=@Column(name="protocolo", nullable=false) ), 
        @AttributeOverride(name="dadosId", column=@Column(name="dados_id", nullable=false) ) } )
    public AtendimentoId getId() {
        return this.id;
    }
    
    public void setId(AtendimentoId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="dados_id", nullable=false, insertable=false, updatable=false)
    public Dados getDados() {
        return this.dados;
    }
    
    public void setDados(Dados dados) {
        this.dados = dados;
    }

    
    @Column(name="natureza_id", nullable=false)
    public int getNaturezaId() {
        return this.naturezaId;
    }
    
    public void setNaturezaId(int naturezaId) {
        this.naturezaId = naturezaId;
    }

    
    @Column(name="natureza_grupo_id", nullable=false)
    public int getNaturezaGrupoId() {
        return this.naturezaGrupoId;
    }
    
    public void setNaturezaGrupoId(int naturezaGrupoId) {
        this.naturezaGrupoId = naturezaGrupoId;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="atendimento")
    public Set getRegistros() {
        return this.registros;
    }
    
    public void setRegistros(Set registros) {
        this.registros = registros;
    }




}


