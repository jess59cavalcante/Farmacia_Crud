package org.generation.farmacia.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name= "tb_produto")
public class Produto {
@Id
@GeneratedValue (strategy=GenerationType.IDENTITY)

private Long Id;


@UpdateTimestamp

private LocalDateTime Validade;

@NotBlank (message= "Digitar Nome do Remédio é obrigatório")

@Size (min=5,max=100,message="A quantidade de caracteres deve estar entre 5 e 100")
private String nome;

@NumberFormat(style=Style.CURRENCY)
private Float Valor;


public String generico;
@NotBlank(message = "O atributo fornecedor é obrigatorio!")
@Size(min = 5, max = 100, message = "O atributo fornecedor deve conter no minimo 05 caracteres")

public String fornecedor;
@NotBlank(message = "O atributo empresa é obrigatorio!")
@Size(min = 2, max = 100, message = "O atributo lote deve conter no minimo 02 caracteres")

private String lote; 
@NotBlank(message = "O atributo lote é obrigatorio!")
@Size(min = 2, max = 100, message = "O atributo lote deve conter no minimo 02 caracteres")

@ManyToOne
@JsonIgnoreProperties("produto")
private Categoria categoria;
public Long getId() {
	return Id;
}
public void setId(Long id) {
	Id = id;
}
public LocalDateTime getValidade() {
	return Validade;
}
public void setValidade(LocalDateTime validade) {
	Validade = validade;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public Float getValor() {
	return Valor;
}
public void setValor(Float valor) {
	Valor = valor;
}
public String getGenerico() {
	return generico;
}
public void setGenerico(String generico) {
	this.generico = generico;
}
public String getFornecedor() {
	return fornecedor;
}
public void setFornecedor(String fornecedor) {
	this.fornecedor = fornecedor;
}
public String getLote() {
	return lote;
}
public void setLote(String lote) {
	this.lote = lote;
}
public Categoria getCategoria() {
	return categoria;
}
public void setCategoria(Categoria categoria) {
	this.categoria = categoria;
}


}









