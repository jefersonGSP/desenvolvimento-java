
package br.com.jeferson.io.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
    private Long cod_product;
    private String name_product;
    private double value_product;
    private String brand_product;
    private String detail_product;
    
    public Product() {}

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public Long getCod_product() {
        return cod_product;
    }

    public void setCod_product(Long cod_product) {
        this.cod_product = cod_product;
    }

    public String getName_product() {
        return name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    public double getValue_product() {
        return value_product;
    }

    public void setValue_product(double value_product) {
        this.value_product = value_product;
    }

    public String getBrand_product() {
        return brand_product;
    }

    public void setBrand_product(String brand_product) {
        this.brand_product = brand_product;
    }

    public String getDetail_product() {
        return detail_product;
    }

    public void setDetail_product(String detail_product) {
        this.detail_product = detail_product;
    }
    
    
}

