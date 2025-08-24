UPDATE insurance_cover
SET name = TRIM(
    REPLACE(
        REPLACE(
            REPLACE(
                REPLACE(
                    REPLACE(
                        REPLACE(
                            REPLACE(
                                REPLACE(
                                    REPLACE(LOWER(name), 'covid', ''), 
                                    'cancer', ''
                                ), 
                                'hiv and aids', ''
                            ), 
                            'hiv & aids', ''
                        ), 
                        'hiv-aids', ''
                    ),
                    'hiv', ''
                ),
                '/', ' '
            ),
            '&', ' '
        ),
        '  ', ' '
    )
);