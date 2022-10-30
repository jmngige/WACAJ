package com.vishal.wacaj.model.webhook;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Entry {
    String id;
    List<Changes> changes = new ArrayList<>();
}
