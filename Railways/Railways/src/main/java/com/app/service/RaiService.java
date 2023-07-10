package com.app.service;

import java.util.List;

import com.app.dto.ApiResponce;
import com.app.entities.Catagory;
import com.app.entities.Railways;

public interface RaiService {
List<Railways> getAllRails();
Railways addRail(Railways transientRail);
Railways updateRail(Railways detachedRail);
String deletRail(Long railId);
List<Railways> getRailbyCat(Catagory c);
}
