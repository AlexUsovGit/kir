package com.home.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User extends BaseEntity {

    @Column(length = 20, nullable = false, unique = true)
    @ApiModelProperty("Пользователь")
    private String username;

    @Column(length = 20)
    @ApiModelProperty("Пароль")
    private String password;

    @Column(length = 20)
    @ApiModelProperty("Роль")
    private String role;

    @Column(nullable = false)
    @ApiModelProperty("Признак активности")
    private boolean active;

    @Column(nullable = false)
    @ApiModelProperty("Отображать настройки для склада")
    private boolean showSklad;

    @Column(nullable = false)
    @ApiModelProperty("Отображать настройки для отчетов")
    private boolean showReport;

    @Column(nullable = false)
    @ApiModelProperty("Отображать настройки для магазина")
    private boolean showStore;

    @Column(nullable = false)
    @ApiModelProperty("Отображать настройки для админа")
    private boolean showAdmin;


}
