package com.vishal.wacaj.model.message;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Action {
    String button;
    List<Button> buttons=new ArrayList<>();
    String catalogId;
    String productRetailerId;
    List<Section> sections=new ArrayList<>();
    
}
