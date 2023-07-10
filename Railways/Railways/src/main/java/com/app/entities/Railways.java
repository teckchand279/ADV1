package com.app.entities;


import java.time.LocalDateTime;

import javax.persistence.*;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="Railways")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Railways extends BaseEntty{
@Column(name="RName")
private String name;
@Column(name="catg")
private Catagory ctgr;
@Column(name="Start_Tm")
private LocalDateTime strtTm;
@Column(name="End_Tm")
private LocalDateTime endTm;
@Column(name="Distance")
private int distance;
@Column(name="frequency")
private int freq;


}
