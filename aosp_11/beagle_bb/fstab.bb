# Android fstab file.
#<src>                                                  <mnt_point>         <type>    <mnt_flags and options>                               <fs_mgr_flags>
# The filesystem that contains the filesystem checker binary (typically /system) cannot
# specify MF_CHECK, and must come before any filesystems that do specify MF_CHECK

/dev/block/mmcblk0p2  /system              ext4      ro,barrier=1,noatime,nosuid,nodev	                                wait,check,first_stage_mount
/dev/block/mmcblk0p3  /vendor              ext4      ro,barrier=1,noatime,nosuid,nodev,nomblk_io_submit,errors=panic    wait
/dev/block/mmcblk0p4  /data                ext4      noatime,nosuid,nodev,nomblk_io_submit,errors=panic                 wait
## This is how you would define an external sdcard (or partion thereof)
## /dev/block/platform/omap/omap_hsmmc.0/mmcblk0p4  /storage/sdcard1    vfat      defaults    wait
