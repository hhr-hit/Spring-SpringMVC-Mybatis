package com.hhr.dao;

import com.hhr.entity.GameData;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GameDataDao {

    int insertGameData(@Param("accountid") int accountid);

    GameData queryGameData(@Param("accountid") int accountid);

    int updateGameData(@Param("accountid") int accountid,
                       @Param("all") int all,
                       @Param("blank") int blank,
                       @Param("house") int house,
                       @Param("trunk") int trunk,
                       @Param("trap") int trap,
                       @Param("cutter") int cutter,
                       @Param("woods") int woods,
                       @Param("woodsChange") int woodsChange,
                       @Param("baiter") int baiter,
                       @Param("baits") int baits,
                       @Param("baitsChange") int baitsChange,
                       @Param("teeth") int teeth,
                       @Param("hunter") int hunter,
                       @Param("meats") int meats,
                       @Param("meatsChange") int meatsChange,
                       @Param("furs") int furs,
                       @Param("fursChange") int fursChange,
                       @Param("baconer") int baconer,
                       @Param("bacons") int bacons,
                       @Param("baconsChange") int baconsChange,
                       @Param("leatherer") int leatherer,
                       @Param("leathers") int leathers,
                       @Param("leathersChange") int leathersChange,
                       @Param("noWoods") int noWoods,
                       @Param("noBaits") int noBaits,
                       @Param("noBacons") int noBacons,
                       @Param("noMeats") int noMeats,
                       @Param("noFurs") int noFurs,
                       @Param("noLeathers") int noLeathers,
                       @Param("noteeth") int noteeth,
                       @Param("cannotBacons1") int cannotBacons1,
                       @Param("cannotBacons2") int cannotBacons2,
                       @Param("cannotBaits") int cannotBaits,
                       @Param("cannotLeathers") int cannotLeathers,
                       @Param("cutTime") int cutTime,
                       @Param("checkTime") int checkTime
    );

}
