package com.example.controller;


import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import org.apache.commons.lang.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


@RestController
@RequestMapping("/guava")
public class GuavaExperiment {

    @PostMapping("/toUnderScoreStyle")
    public ResponseEntity<?> toUnderScoreStyle(@RequestBody String text) {

        String result = Joiner.on("_").join(Splitter.on(" ").omitEmptyStrings().trimResults().split(text));
        System.out.printf("abc");
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping("/toCapital")
    public ResponseEntity<?> toCapital(@RequestBody String text) {
        Iterable<String> ss = Splitter.on(" ").omitEmptyStrings().trimResults().split(text);
        List<String> list = new LinkedList<>();
        for (String s : ss) {
            s = s.toLowerCase();
            s = ("" + s.charAt(0)).toUpperCase() + s.substring(1);
            list.add(s);
        }
        String result = Joiner.on(" ").join(list);

        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping("/optional-join")
    public ResponseEntity<?> optionalJoin(@RequestBody String text) {
        List<String> list = new LinkedList<>();
        list.addAll(Arrays.asList(StringUtils.trimToNull("   "), "abc"));

        String result = Joiner.on(".").skipNulls().join(list);

        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
