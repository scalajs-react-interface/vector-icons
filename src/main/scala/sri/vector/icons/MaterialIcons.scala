package sri.vector.icons

import sri.core.{CreateElementJS, JSComponent, ReactElement}
import sri.macros.{FunctionObjectMacro, OptDefault, OptionalParam}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}

object MaterialIcons {
  @inline
  def apply(
      name: OptionalParam[MaterialIconsName] = OptDefault,
      style: OptionalParam[js.Any] = OptDefault,
      color: OptionalParam[String] = OptDefault,
      size: OptionalParam[Double] = OptDefault
  ): ReactElement = {
    val p = FunctionObjectMacro()
    CreateElementJS[MaterialIconsComponent.type](MaterialIconsComponent, p)
  }
}

@js.native
@JSImport("react-native-vector-icons/MaterialIcons", JSImport.Default)
object MaterialIconsComponent extends JSComponent[js.Object] {}

@ScalaJSDefined
trait MaterialIconsName extends js.Object

object MaterialIconsList {

  @inline def _3D_ROTATION = "3d-rotation".asInstanceOf[MaterialIconsName]
  @inline def AC_UNIT = "ac-unit".asInstanceOf[MaterialIconsName]
  @inline def ACCESS_ALARM = "access-alarm".asInstanceOf[MaterialIconsName]
  @inline def ACCESS_ALARMS = "access-alarms".asInstanceOf[MaterialIconsName]
  @inline def ACCESS_TIME = "access-time".asInstanceOf[MaterialIconsName]
  @inline def ACCESSIBILITY = "accessibility".asInstanceOf[MaterialIconsName]
  @inline def ACCESSIBLE = "accessible".asInstanceOf[MaterialIconsName]
  @inline def ACCOUNT_BALANCE =
    "account-balance".asInstanceOf[MaterialIconsName]
  @inline def ACCOUNT_BALANCE_WALLET =
    "account-balance-wallet".asInstanceOf[MaterialIconsName]
  @inline def ACCOUNT_BOX = "account-box".asInstanceOf[MaterialIconsName]
  @inline def ACCOUNT_CIRCLE = "account-circle".asInstanceOf[MaterialIconsName]
  @inline def ADB = "adb".asInstanceOf[MaterialIconsName]
  @inline def ADD = "add".asInstanceOf[MaterialIconsName]
  @inline def ADD_A_PHOTO = "add-a-photo".asInstanceOf[MaterialIconsName]
  @inline def ADD_ALARM = "add-alarm".asInstanceOf[MaterialIconsName]
  @inline def ADD_ALERT = "add-alert".asInstanceOf[MaterialIconsName]
  @inline def ADD_BOX = "add-box".asInstanceOf[MaterialIconsName]
  @inline def ADD_CIRCLE = "add-circle".asInstanceOf[MaterialIconsName]
  @inline def ADD_CIRCLE_OUTLINE =
    "add-circle-outline".asInstanceOf[MaterialIconsName]
  @inline def ADD_LOCATION = "add-location".asInstanceOf[MaterialIconsName]
  @inline def ADD_SHOPPING_CART =
    "add-shopping-cart".asInstanceOf[MaterialIconsName]
  @inline def ADD_TO_PHOTOS = "add-to-photos".asInstanceOf[MaterialIconsName]
  @inline def ADD_TO_QUEUE = "add-to-queue".asInstanceOf[MaterialIconsName]
  @inline def ADJUST = "adjust".asInstanceOf[MaterialIconsName]
  @inline def AIRLINE_SEAT_FLAT =
    "airline-seat-flat".asInstanceOf[MaterialIconsName]
  @inline def AIRLINE_SEAT_FLAT_ANGLED =
    "airline-seat-flat-angled".asInstanceOf[MaterialIconsName]
  @inline def AIRLINE_SEAT_INDIVIDUAL_SUITE =
    "airline-seat-individual-suite".asInstanceOf[MaterialIconsName]
  @inline def AIRLINE_SEAT_LEGROOM_EXTRA =
    "airline-seat-legroom-extra".asInstanceOf[MaterialIconsName]
  @inline def AIRLINE_SEAT_LEGROOM_NORMAL =
    "airline-seat-legroom-normal".asInstanceOf[MaterialIconsName]
  @inline def AIRLINE_SEAT_LEGROOM_REDUCED =
    "airline-seat-legroom-reduced".asInstanceOf[MaterialIconsName]
  @inline def AIRLINE_SEAT_RECLINE_EXTRA =
    "airline-seat-recline-extra".asInstanceOf[MaterialIconsName]
  @inline def AIRLINE_SEAT_RECLINE_NORMAL =
    "airline-seat-recline-normal".asInstanceOf[MaterialIconsName]
  @inline def AIRPLANEMODE_ACTIVE =
    "airplanemode-active".asInstanceOf[MaterialIconsName]
  @inline def AIRPLANEMODE_INACTIVE =
    "airplanemode-inactive".asInstanceOf[MaterialIconsName]
  @inline def AIRPLAY = "airplay".asInstanceOf[MaterialIconsName]
  @inline def AIRPORT_SHUTTLE =
    "airport-shuttle".asInstanceOf[MaterialIconsName]
  @inline def ALARM = "alarm".asInstanceOf[MaterialIconsName]
  @inline def ALARM_ADD = "alarm-add".asInstanceOf[MaterialIconsName]
  @inline def ALARM_OFF = "alarm-off".asInstanceOf[MaterialIconsName]
  @inline def ALARM_ON = "alarm-on".asInstanceOf[MaterialIconsName]
  @inline def ALBUM = "album".asInstanceOf[MaterialIconsName]
  @inline def ALL_INCLUSIVE = "all-inclusive".asInstanceOf[MaterialIconsName]
  @inline def ALL_OUT = "all-out".asInstanceOf[MaterialIconsName]
  @inline def ANDROID = "android".asInstanceOf[MaterialIconsName]
  @inline def ANNOUNCEMENT = "announcement".asInstanceOf[MaterialIconsName]
  @inline def APPS = "apps".asInstanceOf[MaterialIconsName]
  @inline def ARCHIVE = "archive".asInstanceOf[MaterialIconsName]
  @inline def ARROW_BACK = "arrow-back".asInstanceOf[MaterialIconsName]
  @inline def ARROW_DOWNWARD = "arrow-downward".asInstanceOf[MaterialIconsName]
  @inline def ARROW_DROP_DOWN =
    "arrow-drop-down".asInstanceOf[MaterialIconsName]
  @inline def ARROW_DROP_DOWN_CIRCLE =
    "arrow-drop-down-circle".asInstanceOf[MaterialIconsName]
  @inline def ARROW_DROP_UP = "arrow-drop-up".asInstanceOf[MaterialIconsName]
  @inline def ARROW_FORWARD = "arrow-forward".asInstanceOf[MaterialIconsName]
  @inline def ARROW_UPWARD = "arrow-upward".asInstanceOf[MaterialIconsName]
  @inline def ART_TRACK = "art-track".asInstanceOf[MaterialIconsName]
  @inline def ASPECT_RATIO = "aspect-ratio".asInstanceOf[MaterialIconsName]
  @inline def ASSESSMENT = "assessment".asInstanceOf[MaterialIconsName]
  @inline def ASSIGNMENT = "assignment".asInstanceOf[MaterialIconsName]
  @inline def ASSIGNMENT_IND = "assignment-ind".asInstanceOf[MaterialIconsName]
  @inline def ASSIGNMENT_LATE =
    "assignment-late".asInstanceOf[MaterialIconsName]
  @inline def ASSIGNMENT_RETURN =
    "assignment-return".asInstanceOf[MaterialIconsName]
  @inline def ASSIGNMENT_RETURNED =
    "assignment-returned".asInstanceOf[MaterialIconsName]
  @inline def ASSIGNMENT_TURNED_IN =
    "assignment-turned-in".asInstanceOf[MaterialIconsName]
  @inline def ASSISTANT = "assistant".asInstanceOf[MaterialIconsName]
  @inline def ASSISTANT_PHOTO =
    "assistant-photo".asInstanceOf[MaterialIconsName]
  @inline def ATTACH_FILE = "attach-file".asInstanceOf[MaterialIconsName]
  @inline def ATTACH_MONEY = "attach-money".asInstanceOf[MaterialIconsName]
  @inline def ATTACHMENT = "attachment".asInstanceOf[MaterialIconsName]
  @inline def AUDIOTRACK = "audiotrack".asInstanceOf[MaterialIconsName]
  @inline def AUTORENEW = "autorenew".asInstanceOf[MaterialIconsName]
  @inline def AV_TIMER = "av-timer".asInstanceOf[MaterialIconsName]
  @inline def BACKSPACE = "backspace".asInstanceOf[MaterialIconsName]
  @inline def BACKUP = "backup".asInstanceOf[MaterialIconsName]
  @inline def BATTERY_ALERT = "battery-alert".asInstanceOf[MaterialIconsName]
  @inline def BATTERY_CHARGING_FULL =
    "battery-charging-full".asInstanceOf[MaterialIconsName]
  @inline def BATTERY_FULL = "battery-full".asInstanceOf[MaterialIconsName]
  @inline def BATTERY_STD = "battery-std".asInstanceOf[MaterialIconsName]
  @inline def BATTERY_UNKNOWN =
    "battery-unknown".asInstanceOf[MaterialIconsName]
  @inline def BEACH_ACCESS = "beach-access".asInstanceOf[MaterialIconsName]
  @inline def BEENHERE = "beenhere".asInstanceOf[MaterialIconsName]
  @inline def BLOCK = "block".asInstanceOf[MaterialIconsName]
  @inline def BLUETOOTH = "bluetooth".asInstanceOf[MaterialIconsName]
  @inline def BLUETOOTH_AUDIO =
    "bluetooth-audio".asInstanceOf[MaterialIconsName]
  @inline def BLUETOOTH_CONNECTED =
    "bluetooth-connected".asInstanceOf[MaterialIconsName]
  @inline def BLUETOOTH_DISABLED =
    "bluetooth-disabled".asInstanceOf[MaterialIconsName]
  @inline def BLUETOOTH_SEARCHING =
    "bluetooth-searching".asInstanceOf[MaterialIconsName]
  @inline def BLUR_CIRCULAR = "blur-circular".asInstanceOf[MaterialIconsName]
  @inline def BLUR_LINEAR = "blur-linear".asInstanceOf[MaterialIconsName]
  @inline def BLUR_OFF = "blur-off".asInstanceOf[MaterialIconsName]
  @inline def BLUR_ON = "blur-on".asInstanceOf[MaterialIconsName]
  @inline def BOOK = "book".asInstanceOf[MaterialIconsName]
  @inline def BOOKMARK = "bookmark".asInstanceOf[MaterialIconsName]
  @inline def BOOKMARK_BORDER =
    "bookmark-border".asInstanceOf[MaterialIconsName]
  @inline def BORDER_ALL = "border-all".asInstanceOf[MaterialIconsName]
  @inline def BORDER_BOTTOM = "border-bottom".asInstanceOf[MaterialIconsName]
  @inline def BORDER_CLEAR = "border-clear".asInstanceOf[MaterialIconsName]
  @inline def BORDER_COLOR = "border-color".asInstanceOf[MaterialIconsName]
  @inline def BORDER_HORIZONTAL =
    "border-horizontal".asInstanceOf[MaterialIconsName]
  @inline def BORDER_INNER = "border-inner".asInstanceOf[MaterialIconsName]
  @inline def BORDER_LEFT = "border-left".asInstanceOf[MaterialIconsName]
  @inline def BORDER_OUTER = "border-outer".asInstanceOf[MaterialIconsName]
  @inline def BORDER_RIGHT = "border-right".asInstanceOf[MaterialIconsName]
  @inline def BORDER_STYLE = "border-style".asInstanceOf[MaterialIconsName]
  @inline def BORDER_TOP = "border-top".asInstanceOf[MaterialIconsName]
  @inline def BORDER_VERTICAL =
    "border-vertical".asInstanceOf[MaterialIconsName]
  @inline def BRANDING_WATERMARK =
    "branding-watermark".asInstanceOf[MaterialIconsName]
  @inline def BRIGHTNESS_1 = "brightness-1".asInstanceOf[MaterialIconsName]
  @inline def BRIGHTNESS_2 = "brightness-2".asInstanceOf[MaterialIconsName]
  @inline def BRIGHTNESS_3 = "brightness-3".asInstanceOf[MaterialIconsName]
  @inline def BRIGHTNESS_4 = "brightness-4".asInstanceOf[MaterialIconsName]
  @inline def BRIGHTNESS_5 = "brightness-5".asInstanceOf[MaterialIconsName]
  @inline def BRIGHTNESS_6 = "brightness-6".asInstanceOf[MaterialIconsName]
  @inline def BRIGHTNESS_7 = "brightness-7".asInstanceOf[MaterialIconsName]
  @inline def BRIGHTNESS_AUTO =
    "brightness-auto".asInstanceOf[MaterialIconsName]
  @inline def BRIGHTNESS_HIGH =
    "brightness-high".asInstanceOf[MaterialIconsName]
  @inline def BRIGHTNESS_LOW = "brightness-low".asInstanceOf[MaterialIconsName]
  @inline def BRIGHTNESS_MEDIUM =
    "brightness-medium".asInstanceOf[MaterialIconsName]
  @inline def BROKEN_IMAGE = "broken-image".asInstanceOf[MaterialIconsName]
  @inline def BRUSH = "brush".asInstanceOf[MaterialIconsName]
  @inline def BUBBLE_CHART = "bubble-chart".asInstanceOf[MaterialIconsName]
  @inline def BUG_REPORT = "bug-report".asInstanceOf[MaterialIconsName]
  @inline def BUILD = "build".asInstanceOf[MaterialIconsName]
  @inline def BURST_MODE = "burst-mode".asInstanceOf[MaterialIconsName]
  @inline def BUSINESS = "business".asInstanceOf[MaterialIconsName]
  @inline def BUSINESS_CENTER =
    "business-center".asInstanceOf[MaterialIconsName]
  @inline def CACHED = "cached".asInstanceOf[MaterialIconsName]
  @inline def CAKE = "cake".asInstanceOf[MaterialIconsName]
  @inline def CALL = "call".asInstanceOf[MaterialIconsName]
  @inline def CALL_END = "call-end".asInstanceOf[MaterialIconsName]
  @inline def CALL_MADE = "call-made".asInstanceOf[MaterialIconsName]
  @inline def CALL_MERGE = "call-merge".asInstanceOf[MaterialIconsName]
  @inline def CALL_MISSED = "call-missed".asInstanceOf[MaterialIconsName]
  @inline def CALL_MISSED_OUTGOING =
    "call-missed-outgoing".asInstanceOf[MaterialIconsName]
  @inline def CALL_RECEIVED = "call-received".asInstanceOf[MaterialIconsName]
  @inline def CALL_SPLIT = "call-split".asInstanceOf[MaterialIconsName]
  @inline def CALL_TO_ACTION = "call-to-action".asInstanceOf[MaterialIconsName]
  @inline def CAMERA = "camera".asInstanceOf[MaterialIconsName]
  @inline def CAMERA_ALT = "camera-alt".asInstanceOf[MaterialIconsName]
  @inline def CAMERA_ENHANCE = "camera-enhance".asInstanceOf[MaterialIconsName]
  @inline def CAMERA_FRONT = "camera-front".asInstanceOf[MaterialIconsName]
  @inline def CAMERA_REAR = "camera-rear".asInstanceOf[MaterialIconsName]
  @inline def CAMERA_ROLL = "camera-roll".asInstanceOf[MaterialIconsName]
  @inline def CANCEL = "cancel".asInstanceOf[MaterialIconsName]
  @inline def CARD_GIFTCARD = "card-giftcard".asInstanceOf[MaterialIconsName]
  @inline def CARD_MEMBERSHIP =
    "card-membership".asInstanceOf[MaterialIconsName]
  @inline def CARD_TRAVEL = "card-travel".asInstanceOf[MaterialIconsName]
  @inline def CASINO = "casino".asInstanceOf[MaterialIconsName]
  @inline def CAST = "cast".asInstanceOf[MaterialIconsName]
  @inline def CAST_CONNECTED = "cast-connected".asInstanceOf[MaterialIconsName]
  @inline def CENTER_FOCUS_STRONG =
    "center-focus-strong".asInstanceOf[MaterialIconsName]
  @inline def CENTER_FOCUS_WEAK =
    "center-focus-weak".asInstanceOf[MaterialIconsName]
  @inline def CHANGE_HISTORY = "change-history".asInstanceOf[MaterialIconsName]
  @inline def CHAT = "chat".asInstanceOf[MaterialIconsName]
  @inline def CHAT_BUBBLE = "chat-bubble".asInstanceOf[MaterialIconsName]
  @inline def CHAT_BUBBLE_OUTLINE =
    "chat-bubble-outline".asInstanceOf[MaterialIconsName]
  @inline def CHECK = "check".asInstanceOf[MaterialIconsName]
  @inline def CHECK_BOX = "check-box".asInstanceOf[MaterialIconsName]
  @inline def CHECK_BOX_OUTLINE_BLANK =
    "check-box-outline-blank".asInstanceOf[MaterialIconsName]
  @inline def CHECK_CIRCLE = "check-circle".asInstanceOf[MaterialIconsName]
  @inline def CHEVRON_LEFT = "chevron-left".asInstanceOf[MaterialIconsName]
  @inline def CHEVRON_RIGHT = "chevron-right".asInstanceOf[MaterialIconsName]
  @inline def CHILD_CARE = "child-care".asInstanceOf[MaterialIconsName]
  @inline def CHILD_FRIENDLY = "child-friendly".asInstanceOf[MaterialIconsName]
  @inline def CHROME_READER_MODE =
    "chrome-reader-mode".asInstanceOf[MaterialIconsName]
  @inline def CLASS = "class".asInstanceOf[MaterialIconsName]
  @inline def CLEAR = "clear".asInstanceOf[MaterialIconsName]
  @inline def CLEAR_ALL = "clear-all".asInstanceOf[MaterialIconsName]
  @inline def CLOSE = "close".asInstanceOf[MaterialIconsName]
  @inline def CLOSED_CAPTION = "closed-caption".asInstanceOf[MaterialIconsName]
  @inline def CLOUD = "cloud".asInstanceOf[MaterialIconsName]
  @inline def CLOUD_CIRCLE = "cloud-circle".asInstanceOf[MaterialIconsName]
  @inline def CLOUD_DONE = "cloud-done".asInstanceOf[MaterialIconsName]
  @inline def CLOUD_DOWNLOAD = "cloud-download".asInstanceOf[MaterialIconsName]
  @inline def CLOUD_OFF = "cloud-off".asInstanceOf[MaterialIconsName]
  @inline def CLOUD_QUEUE = "cloud-queue".asInstanceOf[MaterialIconsName]
  @inline def CLOUD_UPLOAD = "cloud-upload".asInstanceOf[MaterialIconsName]
  @inline def CODE = "code".asInstanceOf[MaterialIconsName]
  @inline def COLLECTIONS = "collections".asInstanceOf[MaterialIconsName]
  @inline def COLLECTIONS_BOOKMARK =
    "collections-bookmark".asInstanceOf[MaterialIconsName]
  @inline def COLOR_LENS = "color-lens".asInstanceOf[MaterialIconsName]
  @inline def COLORIZE = "colorize".asInstanceOf[MaterialIconsName]
  @inline def COMMENT = "comment".asInstanceOf[MaterialIconsName]
  @inline def COMPARE = "compare".asInstanceOf[MaterialIconsName]
  @inline def COMPARE_ARROWS = "compare-arrows".asInstanceOf[MaterialIconsName]
  @inline def COMPUTER = "computer".asInstanceOf[MaterialIconsName]
  @inline def CONFIRMATION_NUMBER =
    "confirmation-number".asInstanceOf[MaterialIconsName]
  @inline def CONTACT_MAIL = "contact-mail".asInstanceOf[MaterialIconsName]
  @inline def CONTACT_PHONE = "contact-phone".asInstanceOf[MaterialIconsName]
  @inline def CONTACTS = "contacts".asInstanceOf[MaterialIconsName]
  @inline def CONTENT_COPY = "content-copy".asInstanceOf[MaterialIconsName]
  @inline def CONTENT_CUT = "content-cut".asInstanceOf[MaterialIconsName]
  @inline def CONTENT_PASTE = "content-paste".asInstanceOf[MaterialIconsName]
  @inline def CONTROL_POINT = "control-point".asInstanceOf[MaterialIconsName]
  @inline def CONTROL_POINT_DUPLICATE =
    "control-point-duplicate".asInstanceOf[MaterialIconsName]
  @inline def COPYRIGHT = "copyright".asInstanceOf[MaterialIconsName]
  @inline def CREATE = "create".asInstanceOf[MaterialIconsName]
  @inline def CREATE_NEW_FOLDER =
    "create-new-folder".asInstanceOf[MaterialIconsName]
  @inline def CREDIT_CARD = "credit-card".asInstanceOf[MaterialIconsName]
  @inline def CROP = "crop".asInstanceOf[MaterialIconsName]
  @inline def CROP_16_9 = "crop-16-9".asInstanceOf[MaterialIconsName]
  @inline def CROP_3_2 = "crop-3-2".asInstanceOf[MaterialIconsName]
  @inline def CROP_5_4 = "crop-5-4".asInstanceOf[MaterialIconsName]
  @inline def CROP_7_5 = "crop-7-5".asInstanceOf[MaterialIconsName]
  @inline def CROP_DIN = "crop-din".asInstanceOf[MaterialIconsName]
  @inline def CROP_FREE = "crop-free".asInstanceOf[MaterialIconsName]
  @inline def CROP_LANDSCAPE = "crop-landscape".asInstanceOf[MaterialIconsName]
  @inline def CROP_ORIGINAL = "crop-original".asInstanceOf[MaterialIconsName]
  @inline def CROP_PORTRAIT = "crop-portrait".asInstanceOf[MaterialIconsName]
  @inline def CROP_ROTATE = "crop-rotate".asInstanceOf[MaterialIconsName]
  @inline def CROP_SQUARE = "crop-square".asInstanceOf[MaterialIconsName]
  @inline def DASHBOARD = "dashboard".asInstanceOf[MaterialIconsName]
  @inline def DATA_USAGE = "data-usage".asInstanceOf[MaterialIconsName]
  @inline def DATE_RANGE = "date-range".asInstanceOf[MaterialIconsName]
  @inline def DEHAZE = "dehaze".asInstanceOf[MaterialIconsName]
  @inline def DELETE = "delete".asInstanceOf[MaterialIconsName]
  @inline def DELETE_FOREVER = "delete-forever".asInstanceOf[MaterialIconsName]
  @inline def DELETE_SWEEP = "delete-sweep".asInstanceOf[MaterialIconsName]
  @inline def DESCRIPTION = "description".asInstanceOf[MaterialIconsName]
  @inline def DESKTOP_MAC = "desktop-mac".asInstanceOf[MaterialIconsName]
  @inline def DESKTOP_WINDOWS =
    "desktop-windows".asInstanceOf[MaterialIconsName]
  @inline def DETAILS = "details".asInstanceOf[MaterialIconsName]
  @inline def DEVELOPER_BOARD =
    "developer-board".asInstanceOf[MaterialIconsName]
  @inline def DEVELOPER_MODE = "developer-mode".asInstanceOf[MaterialIconsName]
  @inline def DEVICE_HUB = "device-hub".asInstanceOf[MaterialIconsName]
  @inline def DEVICES = "devices".asInstanceOf[MaterialIconsName]
  @inline def DEVICES_OTHER = "devices-other".asInstanceOf[MaterialIconsName]
  @inline def DIALER_SIP = "dialer-sip".asInstanceOf[MaterialIconsName]
  @inline def DIALPAD = "dialpad".asInstanceOf[MaterialIconsName]
  @inline def DIRECTIONS = "directions".asInstanceOf[MaterialIconsName]
  @inline def DIRECTIONS_BIKE =
    "directions-bike".asInstanceOf[MaterialIconsName]
  @inline def DIRECTIONS_BOAT =
    "directions-boat".asInstanceOf[MaterialIconsName]
  @inline def DIRECTIONS_BUS = "directions-bus".asInstanceOf[MaterialIconsName]
  @inline def DIRECTIONS_CAR = "directions-car".asInstanceOf[MaterialIconsName]
  @inline def DIRECTIONS_RAILWAY =
    "directions-railway".asInstanceOf[MaterialIconsName]
  @inline def DIRECTIONS_RUN = "directions-run".asInstanceOf[MaterialIconsName]
  @inline def DIRECTIONS_SUBWAY =
    "directions-subway".asInstanceOf[MaterialIconsName]
  @inline def DIRECTIONS_TRANSIT =
    "directions-transit".asInstanceOf[MaterialIconsName]
  @inline def DIRECTIONS_WALK =
    "directions-walk".asInstanceOf[MaterialIconsName]
  @inline def DISC_FULL = "disc-full".asInstanceOf[MaterialIconsName]
  @inline def DNS = "dns".asInstanceOf[MaterialIconsName]
  @inline def DO_NOT_DISTURB = "do-not-disturb".asInstanceOf[MaterialIconsName]
  @inline def DO_NOT_DISTURB_ALT =
    "do-not-disturb-alt".asInstanceOf[MaterialIconsName]
  @inline def DO_NOT_DISTURB_OFF =
    "do-not-disturb-off".asInstanceOf[MaterialIconsName]
  @inline def DO_NOT_DISTURB_ON =
    "do-not-disturb-on".asInstanceOf[MaterialIconsName]
  @inline def DOCK = "dock".asInstanceOf[MaterialIconsName]
  @inline def DOMAIN = "domain".asInstanceOf[MaterialIconsName]
  @inline def DONE = "done".asInstanceOf[MaterialIconsName]
  @inline def DONE_ALL = "done-all".asInstanceOf[MaterialIconsName]
  @inline def DONUT_LARGE = "donut-large".asInstanceOf[MaterialIconsName]
  @inline def DONUT_SMALL = "donut-small".asInstanceOf[MaterialIconsName]
  @inline def DRAFTS = "drafts".asInstanceOf[MaterialIconsName]
  @inline def DRAG_HANDLE = "drag-handle".asInstanceOf[MaterialIconsName]
  @inline def DRIVE_ETA = "drive-eta".asInstanceOf[MaterialIconsName]
  @inline def DVR = "dvr".asInstanceOf[MaterialIconsName]
  @inline def EDIT = "edit".asInstanceOf[MaterialIconsName]
  @inline def EDIT_LOCATION = "edit-location".asInstanceOf[MaterialIconsName]
  @inline def EJECT = "eject".asInstanceOf[MaterialIconsName]
  @inline def EMAIL = "email".asInstanceOf[MaterialIconsName]
  @inline def ENHANCED_ENCRYPTION =
    "enhanced-encryption".asInstanceOf[MaterialIconsName]
  @inline def EQUALIZER = "equalizer".asInstanceOf[MaterialIconsName]
  @inline def ERROR = "error".asInstanceOf[MaterialIconsName]
  @inline def ERROR_OUTLINE = "error-outline".asInstanceOf[MaterialIconsName]
  @inline def EURO_SYMBOL = "euro-symbol".asInstanceOf[MaterialIconsName]
  @inline def EV_STATION = "ev-station".asInstanceOf[MaterialIconsName]
  @inline def EVENT = "event".asInstanceOf[MaterialIconsName]
  @inline def EVENT_AVAILABLE =
    "event-available".asInstanceOf[MaterialIconsName]
  @inline def EVENT_BUSY = "event-busy".asInstanceOf[MaterialIconsName]
  @inline def EVENT_NOTE = "event-note".asInstanceOf[MaterialIconsName]
  @inline def EVENT_SEAT = "event-seat".asInstanceOf[MaterialIconsName]
  @inline def EXIT_TO_APP = "exit-to-app".asInstanceOf[MaterialIconsName]
  @inline def EXPAND_LESS = "expand-less".asInstanceOf[MaterialIconsName]
  @inline def EXPAND_MORE = "expand-more".asInstanceOf[MaterialIconsName]
  @inline def EXPLICIT = "explicit".asInstanceOf[MaterialIconsName]
  @inline def EXPLORE = "explore".asInstanceOf[MaterialIconsName]
  @inline def EXPOSURE = "exposure".asInstanceOf[MaterialIconsName]
  @inline def EXPOSURE_NEG_1 = "exposure-neg-1".asInstanceOf[MaterialIconsName]
  @inline def EXPOSURE_NEG_2 = "exposure-neg-2".asInstanceOf[MaterialIconsName]
  @inline def EXPOSURE_PLUS_1 =
    "exposure-plus-1".asInstanceOf[MaterialIconsName]
  @inline def EXPOSURE_PLUS_2 =
    "exposure-plus-2".asInstanceOf[MaterialIconsName]
  @inline def EXPOSURE_ZERO = "exposure-zero".asInstanceOf[MaterialIconsName]
  @inline def EXTENSION = "extension".asInstanceOf[MaterialIconsName]
  @inline def FACE = "face".asInstanceOf[MaterialIconsName]
  @inline def FAST_FORWARD = "fast-forward".asInstanceOf[MaterialIconsName]
  @inline def FAST_REWIND = "fast-rewind".asInstanceOf[MaterialIconsName]
  @inline def FAVORITE = "favorite".asInstanceOf[MaterialIconsName]
  @inline def FAVORITE_BORDER =
    "favorite-border".asInstanceOf[MaterialIconsName]
  @inline def FEATURED_PLAY_LIST =
    "featured-play-list".asInstanceOf[MaterialIconsName]
  @inline def FEATURED_VIDEO = "featured-video".asInstanceOf[MaterialIconsName]
  @inline def FEEDBACK = "feedback".asInstanceOf[MaterialIconsName]
  @inline def FIBER_DVR = "fiber-dvr".asInstanceOf[MaterialIconsName]
  @inline def FIBER_MANUAL_RECORD =
    "fiber-manual-record".asInstanceOf[MaterialIconsName]
  @inline def FIBER_NEW = "fiber-new".asInstanceOf[MaterialIconsName]
  @inline def FIBER_PIN = "fiber-pin".asInstanceOf[MaterialIconsName]
  @inline def FIBER_SMART_RECORD =
    "fiber-smart-record".asInstanceOf[MaterialIconsName]
  @inline def FILE_DOWNLOAD = "file-download".asInstanceOf[MaterialIconsName]
  @inline def FILE_UPLOAD = "file-upload".asInstanceOf[MaterialIconsName]
  @inline def FILTER = "filter".asInstanceOf[MaterialIconsName]
  @inline def FILTER_1 = "filter-1".asInstanceOf[MaterialIconsName]
  @inline def FILTER_2 = "filter-2".asInstanceOf[MaterialIconsName]
  @inline def FILTER_3 = "filter-3".asInstanceOf[MaterialIconsName]
  @inline def FILTER_4 = "filter-4".asInstanceOf[MaterialIconsName]
  @inline def FILTER_5 = "filter-5".asInstanceOf[MaterialIconsName]
  @inline def FILTER_6 = "filter-6".asInstanceOf[MaterialIconsName]
  @inline def FILTER_7 = "filter-7".asInstanceOf[MaterialIconsName]
  @inline def FILTER_8 = "filter-8".asInstanceOf[MaterialIconsName]
  @inline def FILTER_9 = "filter-9".asInstanceOf[MaterialIconsName]
  @inline def FILTER_9_PLUS = "filter-9-plus".asInstanceOf[MaterialIconsName]
  @inline def FILTER_B_AND_W = "filter-b-and-w".asInstanceOf[MaterialIconsName]
  @inline def FILTER_CENTER_FOCUS =
    "filter-center-focus".asInstanceOf[MaterialIconsName]
  @inline def FILTER_DRAMA = "filter-drama".asInstanceOf[MaterialIconsName]
  @inline def FILTER_FRAMES = "filter-frames".asInstanceOf[MaterialIconsName]
  @inline def FILTER_HDR = "filter-hdr".asInstanceOf[MaterialIconsName]
  @inline def FILTER_LIST = "filter-list".asInstanceOf[MaterialIconsName]
  @inline def FILTER_NONE = "filter-none".asInstanceOf[MaterialIconsName]
  @inline def FILTER_TILT_SHIFT =
    "filter-tilt-shift".asInstanceOf[MaterialIconsName]
  @inline def FILTER_VINTAGE = "filter-vintage".asInstanceOf[MaterialIconsName]
  @inline def FIND_IN_PAGE = "find-in-page".asInstanceOf[MaterialIconsName]
  @inline def FIND_REPLACE = "find-replace".asInstanceOf[MaterialIconsName]
  @inline def FINGERPRINT = "fingerprint".asInstanceOf[MaterialIconsName]
  @inline def FIRST_PAGE = "first-page".asInstanceOf[MaterialIconsName]
  @inline def FITNESS_CENTER = "fitness-center".asInstanceOf[MaterialIconsName]
  @inline def FLAG = "flag".asInstanceOf[MaterialIconsName]
  @inline def FLARE = "flare".asInstanceOf[MaterialIconsName]
  @inline def FLASH_AUTO = "flash-auto".asInstanceOf[MaterialIconsName]
  @inline def FLASH_OFF = "flash-off".asInstanceOf[MaterialIconsName]
  @inline def FLASH_ON = "flash-on".asInstanceOf[MaterialIconsName]
  @inline def FLIGHT = "flight".asInstanceOf[MaterialIconsName]
  @inline def FLIGHT_LAND = "flight-land".asInstanceOf[MaterialIconsName]
  @inline def FLIGHT_TAKEOFF = "flight-takeoff".asInstanceOf[MaterialIconsName]
  @inline def FLIP = "flip".asInstanceOf[MaterialIconsName]
  @inline def FLIP_TO_BACK = "flip-to-back".asInstanceOf[MaterialIconsName]
  @inline def FLIP_TO_FRONT = "flip-to-front".asInstanceOf[MaterialIconsName]
  @inline def FOLDER = "folder".asInstanceOf[MaterialIconsName]
  @inline def FOLDER_OPEN = "folder-open".asInstanceOf[MaterialIconsName]
  @inline def FOLDER_SHARED = "folder-shared".asInstanceOf[MaterialIconsName]
  @inline def FOLDER_SPECIAL = "folder-special".asInstanceOf[MaterialIconsName]
  @inline def FONT_DOWNLOAD = "font-download".asInstanceOf[MaterialIconsName]
  @inline def FORMAT_ALIGN_CENTER =
    "format-align-center".asInstanceOf[MaterialIconsName]
  @inline def FORMAT_ALIGN_JUSTIFY =
    "format-align-justify".asInstanceOf[MaterialIconsName]
  @inline def FORMAT_ALIGN_LEFT =
    "format-align-left".asInstanceOf[MaterialIconsName]
  @inline def FORMAT_ALIGN_RIGHT =
    "format-align-right".asInstanceOf[MaterialIconsName]
  @inline def FORMAT_BOLD = "format-bold".asInstanceOf[MaterialIconsName]
  @inline def FORMAT_CLEAR = "format-clear".asInstanceOf[MaterialIconsName]
  @inline def FORMAT_COLOR_FILL =
    "format-color-fill".asInstanceOf[MaterialIconsName]
  @inline def FORMAT_COLOR_RESET =
    "format-color-reset".asInstanceOf[MaterialIconsName]
  @inline def FORMAT_COLOR_TEXT =
    "format-color-text".asInstanceOf[MaterialIconsName]
  @inline def FORMAT_INDENT_DECREASE =
    "format-indent-decrease".asInstanceOf[MaterialIconsName]
  @inline def FORMAT_INDENT_INCREASE =
    "format-indent-increase".asInstanceOf[MaterialIconsName]
  @inline def FORMAT_ITALIC = "format-italic".asInstanceOf[MaterialIconsName]
  @inline def FORMAT_LINE_SPACING =
    "format-line-spacing".asInstanceOf[MaterialIconsName]
  @inline def FORMAT_LIST_BULLETED =
    "format-list-bulleted".asInstanceOf[MaterialIconsName]
  @inline def FORMAT_LIST_NUMBERED =
    "format-list-numbered".asInstanceOf[MaterialIconsName]
  @inline def FORMAT_PAINT = "format-paint".asInstanceOf[MaterialIconsName]
  @inline def FORMAT_QUOTE = "format-quote".asInstanceOf[MaterialIconsName]
  @inline def FORMAT_SHAPES = "format-shapes".asInstanceOf[MaterialIconsName]
  @inline def FORMAT_SIZE = "format-size".asInstanceOf[MaterialIconsName]
  @inline def FORMAT_STRIKETHROUGH =
    "format-strikethrough".asInstanceOf[MaterialIconsName]
  @inline def FORMAT_TEXTDIRECTION_L_TO_R =
    "format-textdirection-l-to-r".asInstanceOf[MaterialIconsName]
  @inline def FORMAT_TEXTDIRECTION_R_TO_L =
    "format-textdirection-r-to-l".asInstanceOf[MaterialIconsName]
  @inline def FORMAT_UNDERLINED =
    "format-underlined".asInstanceOf[MaterialIconsName]
  @inline def FORUM = "forum".asInstanceOf[MaterialIconsName]
  @inline def FORWARD = "forward".asInstanceOf[MaterialIconsName]
  @inline def FORWARD_10 = "forward-10".asInstanceOf[MaterialIconsName]
  @inline def FORWARD_30 = "forward-30".asInstanceOf[MaterialIconsName]
  @inline def FORWARD_5 = "forward-5".asInstanceOf[MaterialIconsName]
  @inline def FREE_BREAKFAST = "free-breakfast".asInstanceOf[MaterialIconsName]
  @inline def FULLSCREEN = "fullscreen".asInstanceOf[MaterialIconsName]
  @inline def FULLSCREEN_EXIT =
    "fullscreen-exit".asInstanceOf[MaterialIconsName]
  @inline def FUNCTIONS = "functions".asInstanceOf[MaterialIconsName]
  @inline def G_TRANSLATE = "g-translate".asInstanceOf[MaterialIconsName]
  @inline def GAMEPAD = "gamepad".asInstanceOf[MaterialIconsName]
  @inline def GAMES = "games".asInstanceOf[MaterialIconsName]
  @inline def GAVEL = "gavel".asInstanceOf[MaterialIconsName]
  @inline def GESTURE = "gesture".asInstanceOf[MaterialIconsName]
  @inline def GET_APP = "get-app".asInstanceOf[MaterialIconsName]
  @inline def GIF = "gif".asInstanceOf[MaterialIconsName]
  @inline def GOLF_COURSE = "golf-course".asInstanceOf[MaterialIconsName]
  @inline def GPS_FIXED = "gps-fixed".asInstanceOf[MaterialIconsName]
  @inline def GPS_NOT_FIXED = "gps-not-fixed".asInstanceOf[MaterialIconsName]
  @inline def GPS_OFF = "gps-off".asInstanceOf[MaterialIconsName]
  @inline def GRADE = "grade".asInstanceOf[MaterialIconsName]
  @inline def GRADIENT = "gradient".asInstanceOf[MaterialIconsName]
  @inline def GRAIN = "grain".asInstanceOf[MaterialIconsName]
  @inline def GRAPHIC_EQ = "graphic-eq".asInstanceOf[MaterialIconsName]
  @inline def GRID_OFF = "grid-off".asInstanceOf[MaterialIconsName]
  @inline def GRID_ON = "grid-on".asInstanceOf[MaterialIconsName]
  @inline def GROUP = "group".asInstanceOf[MaterialIconsName]
  @inline def GROUP_ADD = "group-add".asInstanceOf[MaterialIconsName]
  @inline def GROUP_WORK = "group-work".asInstanceOf[MaterialIconsName]
  @inline def HD = "hd".asInstanceOf[MaterialIconsName]
  @inline def HDR_OFF = "hdr-off".asInstanceOf[MaterialIconsName]
  @inline def HDR_ON = "hdr-on".asInstanceOf[MaterialIconsName]
  @inline def HDR_STRONG = "hdr-strong".asInstanceOf[MaterialIconsName]
  @inline def HDR_WEAK = "hdr-weak".asInstanceOf[MaterialIconsName]
  @inline def HEADSET = "headset".asInstanceOf[MaterialIconsName]
  @inline def HEADSET_MIC = "headset-mic".asInstanceOf[MaterialIconsName]
  @inline def HEALING = "healing".asInstanceOf[MaterialIconsName]
  @inline def HEARING = "hearing".asInstanceOf[MaterialIconsName]
  @inline def HELP = "help".asInstanceOf[MaterialIconsName]
  @inline def HELP_OUTLINE = "help-outline".asInstanceOf[MaterialIconsName]
  @inline def HIGH_QUALITY = "high-quality".asInstanceOf[MaterialIconsName]
  @inline def HIGHLIGHT = "highlight".asInstanceOf[MaterialIconsName]
  @inline def HIGHLIGHT_OFF = "highlight-off".asInstanceOf[MaterialIconsName]
  @inline def HISTORY = "history".asInstanceOf[MaterialIconsName]
  @inline def HOME = "home".asInstanceOf[MaterialIconsName]
  @inline def HOT_TUB = "hot-tub".asInstanceOf[MaterialIconsName]
  @inline def HOTEL = "hotel".asInstanceOf[MaterialIconsName]
  @inline def HOURGLASS_EMPTY =
    "hourglass-empty".asInstanceOf[MaterialIconsName]
  @inline def HOURGLASS_FULL = "hourglass-full".asInstanceOf[MaterialIconsName]
  @inline def HTTP = "http".asInstanceOf[MaterialIconsName]
  @inline def HTTPS = "https".asInstanceOf[MaterialIconsName]
  @inline def IMAGE = "image".asInstanceOf[MaterialIconsName]
  @inline def IMAGE_ASPECT_RATIO =
    "image-aspect-ratio".asInstanceOf[MaterialIconsName]
  @inline def IMPORT_CONTACTS =
    "import-contacts".asInstanceOf[MaterialIconsName]
  @inline def IMPORT_EXPORT = "import-export".asInstanceOf[MaterialIconsName]
  @inline def IMPORTANT_DEVICES =
    "important-devices".asInstanceOf[MaterialIconsName]
  @inline def INBOX = "inbox".asInstanceOf[MaterialIconsName]
  @inline def INDETERMINATE_CHECK_BOX =
    "indeterminate-check-box".asInstanceOf[MaterialIconsName]
  @inline def INFO = "info".asInstanceOf[MaterialIconsName]
  @inline def INFO_OUTLINE = "info-outline".asInstanceOf[MaterialIconsName]
  @inline def INPUT = "input".asInstanceOf[MaterialIconsName]
  @inline def INSERT_CHART = "insert-chart".asInstanceOf[MaterialIconsName]
  @inline def INSERT_COMMENT = "insert-comment".asInstanceOf[MaterialIconsName]
  @inline def INSERT_DRIVE_FILE =
    "insert-drive-file".asInstanceOf[MaterialIconsName]
  @inline def INSERT_EMOTICON =
    "insert-emoticon".asInstanceOf[MaterialIconsName]
  @inline def INSERT_INVITATION =
    "insert-invitation".asInstanceOf[MaterialIconsName]
  @inline def INSERT_LINK = "insert-link".asInstanceOf[MaterialIconsName]
  @inline def INSERT_PHOTO = "insert-photo".asInstanceOf[MaterialIconsName]
  @inline def INVERT_COLORS = "invert-colors".asInstanceOf[MaterialIconsName]
  @inline def INVERT_COLORS_OFF =
    "invert-colors-off".asInstanceOf[MaterialIconsName]
  @inline def ISO = "iso".asInstanceOf[MaterialIconsName]
  @inline def KEYBOARD = "keyboard".asInstanceOf[MaterialIconsName]
  @inline def KEYBOARD_ARROW_DOWN =
    "keyboard-arrow-down".asInstanceOf[MaterialIconsName]
  @inline def KEYBOARD_ARROW_LEFT =
    "keyboard-arrow-left".asInstanceOf[MaterialIconsName]
  @inline def KEYBOARD_ARROW_RIGHT =
    "keyboard-arrow-right".asInstanceOf[MaterialIconsName]
  @inline def KEYBOARD_ARROW_UP =
    "keyboard-arrow-up".asInstanceOf[MaterialIconsName]
  @inline def KEYBOARD_BACKSPACE =
    "keyboard-backspace".asInstanceOf[MaterialIconsName]
  @inline def KEYBOARD_CAPSLOCK =
    "keyboard-capslock".asInstanceOf[MaterialIconsName]
  @inline def KEYBOARD_HIDE = "keyboard-hide".asInstanceOf[MaterialIconsName]
  @inline def KEYBOARD_RETURN =
    "keyboard-return".asInstanceOf[MaterialIconsName]
  @inline def KEYBOARD_TAB = "keyboard-tab".asInstanceOf[MaterialIconsName]
  @inline def KEYBOARD_VOICE = "keyboard-voice".asInstanceOf[MaterialIconsName]
  @inline def KITCHEN = "kitchen".asInstanceOf[MaterialIconsName]
  @inline def LABEL = "label".asInstanceOf[MaterialIconsName]
  @inline def LABEL_OUTLINE = "label-outline".asInstanceOf[MaterialIconsName]
  @inline def LANDSCAPE = "landscape".asInstanceOf[MaterialIconsName]
  @inline def LANGUAGE = "language".asInstanceOf[MaterialIconsName]
  @inline def LAPTOP = "laptop".asInstanceOf[MaterialIconsName]
  @inline def LAPTOP_CHROMEBOOK =
    "laptop-chromebook".asInstanceOf[MaterialIconsName]
  @inline def LAPTOP_MAC = "laptop-mac".asInstanceOf[MaterialIconsName]
  @inline def LAPTOP_WINDOWS = "laptop-windows".asInstanceOf[MaterialIconsName]
  @inline def LAST_PAGE = "last-page".asInstanceOf[MaterialIconsName]
  @inline def LAUNCH = "launch".asInstanceOf[MaterialIconsName]
  @inline def LAYERS = "layers".asInstanceOf[MaterialIconsName]
  @inline def LAYERS_CLEAR = "layers-clear".asInstanceOf[MaterialIconsName]
  @inline def LEAK_ADD = "leak-add".asInstanceOf[MaterialIconsName]
  @inline def LEAK_REMOVE = "leak-remove".asInstanceOf[MaterialIconsName]
  @inline def LENS = "lens".asInstanceOf[MaterialIconsName]
  @inline def LIBRARY_ADD = "library-add".asInstanceOf[MaterialIconsName]
  @inline def LIBRARY_BOOKS = "library-books".asInstanceOf[MaterialIconsName]
  @inline def LIBRARY_MUSIC = "library-music".asInstanceOf[MaterialIconsName]
  @inline def LIGHTBULB_OUTLINE =
    "lightbulb-outline".asInstanceOf[MaterialIconsName]
  @inline def LINE_STYLE = "line-style".asInstanceOf[MaterialIconsName]
  @inline def LINE_WEIGHT = "line-weight".asInstanceOf[MaterialIconsName]
  @inline def LINEAR_SCALE = "linear-scale".asInstanceOf[MaterialIconsName]
  @inline def LINK = "link".asInstanceOf[MaterialIconsName]
  @inline def LINKED_CAMERA = "linked-camera".asInstanceOf[MaterialIconsName]
  @inline def LIST = "list".asInstanceOf[MaterialIconsName]
  @inline def LIVE_HELP = "live-help".asInstanceOf[MaterialIconsName]
  @inline def LIVE_TV = "live-tv".asInstanceOf[MaterialIconsName]
  @inline def LOCAL_ACTIVITY = "local-activity".asInstanceOf[MaterialIconsName]
  @inline def LOCAL_AIRPORT = "local-airport".asInstanceOf[MaterialIconsName]
  @inline def LOCAL_ATM = "local-atm".asInstanceOf[MaterialIconsName]
  @inline def LOCAL_BAR = "local-bar".asInstanceOf[MaterialIconsName]
  @inline def LOCAL_CAFE = "local-cafe".asInstanceOf[MaterialIconsName]
  @inline def LOCAL_CAR_WASH = "local-car-wash".asInstanceOf[MaterialIconsName]
  @inline def LOCAL_CONVENIENCE_STORE =
    "local-convenience-store".asInstanceOf[MaterialIconsName]
  @inline def LOCAL_DINING = "local-dining".asInstanceOf[MaterialIconsName]
  @inline def LOCAL_DRINK = "local-drink".asInstanceOf[MaterialIconsName]
  @inline def LOCAL_FLORIST = "local-florist".asInstanceOf[MaterialIconsName]
  @inline def LOCAL_GAS_STATION =
    "local-gas-station".asInstanceOf[MaterialIconsName]
  @inline def LOCAL_GROCERY_STORE =
    "local-grocery-store".asInstanceOf[MaterialIconsName]
  @inline def LOCAL_HOSPITAL = "local-hospital".asInstanceOf[MaterialIconsName]
  @inline def LOCAL_HOTEL = "local-hotel".asInstanceOf[MaterialIconsName]
  @inline def LOCAL_LAUNDRY_SERVICE =
    "local-laundry-service".asInstanceOf[MaterialIconsName]
  @inline def LOCAL_LIBRARY = "local-library".asInstanceOf[MaterialIconsName]
  @inline def LOCAL_MALL = "local-mall".asInstanceOf[MaterialIconsName]
  @inline def LOCAL_MOVIES = "local-movies".asInstanceOf[MaterialIconsName]
  @inline def LOCAL_OFFER = "local-offer".asInstanceOf[MaterialIconsName]
  @inline def LOCAL_PARKING = "local-parking".asInstanceOf[MaterialIconsName]
  @inline def LOCAL_PHARMACY = "local-pharmacy".asInstanceOf[MaterialIconsName]
  @inline def LOCAL_PHONE = "local-phone".asInstanceOf[MaterialIconsName]
  @inline def LOCAL_PIZZA = "local-pizza".asInstanceOf[MaterialIconsName]
  @inline def LOCAL_PLAY = "local-play".asInstanceOf[MaterialIconsName]
  @inline def LOCAL_POST_OFFICE =
    "local-post-office".asInstanceOf[MaterialIconsName]
  @inline def LOCAL_PRINTSHOP =
    "local-printshop".asInstanceOf[MaterialIconsName]
  @inline def LOCAL_SEE = "local-see".asInstanceOf[MaterialIconsName]
  @inline def LOCAL_SHIPPING = "local-shipping".asInstanceOf[MaterialIconsName]
  @inline def LOCAL_TAXI = "local-taxi".asInstanceOf[MaterialIconsName]
  @inline def LOCATION_CITY = "location-city".asInstanceOf[MaterialIconsName]
  @inline def LOCATION_DISABLED =
    "location-disabled".asInstanceOf[MaterialIconsName]
  @inline def LOCATION_OFF = "location-off".asInstanceOf[MaterialIconsName]
  @inline def LOCATION_ON = "location-on".asInstanceOf[MaterialIconsName]
  @inline def LOCATION_SEARCHING =
    "location-searching".asInstanceOf[MaterialIconsName]
  @inline def LOCK = "lock".asInstanceOf[MaterialIconsName]
  @inline def LOCK_OPEN = "lock-open".asInstanceOf[MaterialIconsName]
  @inline def LOCK_OUTLINE = "lock-outline".asInstanceOf[MaterialIconsName]
  @inline def LOOKS = "looks".asInstanceOf[MaterialIconsName]
  @inline def LOOKS_3 = "looks-3".asInstanceOf[MaterialIconsName]
  @inline def LOOKS_4 = "looks-4".asInstanceOf[MaterialIconsName]
  @inline def LOOKS_5 = "looks-5".asInstanceOf[MaterialIconsName]
  @inline def LOOKS_6 = "looks-6".asInstanceOf[MaterialIconsName]
  @inline def LOOKS_ONE = "looks-one".asInstanceOf[MaterialIconsName]
  @inline def LOOKS_TWO = "looks-two".asInstanceOf[MaterialIconsName]
  @inline def LOOP = "loop".asInstanceOf[MaterialIconsName]
  @inline def LOUPE = "loupe".asInstanceOf[MaterialIconsName]
  @inline def LOW_PRIORITY = "low-priority".asInstanceOf[MaterialIconsName]
  @inline def LOYALTY = "loyalty".asInstanceOf[MaterialIconsName]
  @inline def MAIL = "mail".asInstanceOf[MaterialIconsName]
  @inline def MAIL_OUTLINE = "mail-outline".asInstanceOf[MaterialIconsName]
  @inline def MAP = "map".asInstanceOf[MaterialIconsName]
  @inline def MARKUNREAD = "markunread".asInstanceOf[MaterialIconsName]
  @inline def MARKUNREAD_MAILBOX =
    "markunread-mailbox".asInstanceOf[MaterialIconsName]
  @inline def MEMORY = "memory".asInstanceOf[MaterialIconsName]
  @inline def MENU = "menu".asInstanceOf[MaterialIconsName]
  @inline def MERGE_TYPE = "merge-type".asInstanceOf[MaterialIconsName]
  @inline def MESSAGE = "message".asInstanceOf[MaterialIconsName]
  @inline def MIC = "mic".asInstanceOf[MaterialIconsName]
  @inline def MIC_NONE = "mic-none".asInstanceOf[MaterialIconsName]
  @inline def MIC_OFF = "mic-off".asInstanceOf[MaterialIconsName]
  @inline def MMS = "mms".asInstanceOf[MaterialIconsName]
  @inline def MODE_COMMENT = "mode-comment".asInstanceOf[MaterialIconsName]
  @inline def MODE_EDIT = "mode-edit".asInstanceOf[MaterialIconsName]
  @inline def MONETIZATION_ON =
    "monetization-on".asInstanceOf[MaterialIconsName]
  @inline def MONEY_OFF = "money-off".asInstanceOf[MaterialIconsName]
  @inline def MONOCHROME_PHOTOS =
    "monochrome-photos".asInstanceOf[MaterialIconsName]
  @inline def MOOD = "mood".asInstanceOf[MaterialIconsName]
  @inline def MOOD_BAD = "mood-bad".asInstanceOf[MaterialIconsName]
  @inline def MORE = "more".asInstanceOf[MaterialIconsName]
  @inline def MORE_HORIZ = "more-horiz".asInstanceOf[MaterialIconsName]
  @inline def MORE_VERT = "more-vert".asInstanceOf[MaterialIconsName]
  @inline def MOTORCYCLE = "motorcycle".asInstanceOf[MaterialIconsName]
  @inline def MOUSE = "mouse".asInstanceOf[MaterialIconsName]
  @inline def MOVE_TO_INBOX = "move-to-inbox".asInstanceOf[MaterialIconsName]
  @inline def MOVIE = "movie".asInstanceOf[MaterialIconsName]
  @inline def MOVIE_CREATION = "movie-creation".asInstanceOf[MaterialIconsName]
  @inline def MOVIE_FILTER = "movie-filter".asInstanceOf[MaterialIconsName]
  @inline def MULTILINE_CHART =
    "multiline-chart".asInstanceOf[MaterialIconsName]
  @inline def MUSIC_NOTE = "music-note".asInstanceOf[MaterialIconsName]
  @inline def MUSIC_VIDEO = "music-video".asInstanceOf[MaterialIconsName]
  @inline def MY_LOCATION = "my-location".asInstanceOf[MaterialIconsName]
  @inline def NATURE = "nature".asInstanceOf[MaterialIconsName]
  @inline def NATURE_PEOPLE = "nature-people".asInstanceOf[MaterialIconsName]
  @inline def NAVIGATE_BEFORE =
    "navigate-before".asInstanceOf[MaterialIconsName]
  @inline def NAVIGATE_NEXT = "navigate-next".asInstanceOf[MaterialIconsName]
  @inline def NAVIGATION = "navigation".asInstanceOf[MaterialIconsName]
  @inline def NEAR_ME = "near-me".asInstanceOf[MaterialIconsName]
  @inline def NETWORK_CELL = "network-cell".asInstanceOf[MaterialIconsName]
  @inline def NETWORK_CHECK = "network-check".asInstanceOf[MaterialIconsName]
  @inline def NETWORK_LOCKED = "network-locked".asInstanceOf[MaterialIconsName]
  @inline def NETWORK_WIFI = "network-wifi".asInstanceOf[MaterialIconsName]
  @inline def NEW_RELEASES = "new-releases".asInstanceOf[MaterialIconsName]
  @inline def NEXT_WEEK = "next-week".asInstanceOf[MaterialIconsName]
  @inline def NFC = "nfc".asInstanceOf[MaterialIconsName]
  @inline def NO_ENCRYPTION = "no-encryption".asInstanceOf[MaterialIconsName]
  @inline def NO_SIM = "no-sim".asInstanceOf[MaterialIconsName]
  @inline def NOT_INTERESTED = "not-interested".asInstanceOf[MaterialIconsName]
  @inline def NOTE = "note".asInstanceOf[MaterialIconsName]
  @inline def NOTE_ADD = "note-add".asInstanceOf[MaterialIconsName]
  @inline def NOTIFICATIONS = "notifications".asInstanceOf[MaterialIconsName]
  @inline def NOTIFICATIONS_ACTIVE =
    "notifications-active".asInstanceOf[MaterialIconsName]
  @inline def NOTIFICATIONS_NONE =
    "notifications-none".asInstanceOf[MaterialIconsName]
  @inline def NOTIFICATIONS_OFF =
    "notifications-off".asInstanceOf[MaterialIconsName]
  @inline def NOTIFICATIONS_PAUSED =
    "notifications-paused".asInstanceOf[MaterialIconsName]
  @inline def OFFLINE_PIN = "offline-pin".asInstanceOf[MaterialIconsName]
  @inline def ONDEMAND_VIDEO = "ondemand-video".asInstanceOf[MaterialIconsName]
  @inline def OPACITY = "opacity".asInstanceOf[MaterialIconsName]
  @inline def OPEN_IN_BROWSER =
    "open-in-browser".asInstanceOf[MaterialIconsName]
  @inline def OPEN_IN_NEW = "open-in-new".asInstanceOf[MaterialIconsName]
  @inline def OPEN_WITH = "open-with".asInstanceOf[MaterialIconsName]
  @inline def PAGES = "pages".asInstanceOf[MaterialIconsName]
  @inline def PAGEVIEW = "pageview".asInstanceOf[MaterialIconsName]
  @inline def PALETTE = "palette".asInstanceOf[MaterialIconsName]
  @inline def PAN_TOOL = "pan-tool".asInstanceOf[MaterialIconsName]
  @inline def PANORAMA = "panorama".asInstanceOf[MaterialIconsName]
  @inline def PANORAMA_FISH_EYE =
    "panorama-fish-eye".asInstanceOf[MaterialIconsName]
  @inline def PANORAMA_HORIZONTAL =
    "panorama-horizontal".asInstanceOf[MaterialIconsName]
  @inline def PANORAMA_VERTICAL =
    "panorama-vertical".asInstanceOf[MaterialIconsName]
  @inline def PANORAMA_WIDE_ANGLE =
    "panorama-wide-angle".asInstanceOf[MaterialIconsName]
  @inline def PARTY_MODE = "party-mode".asInstanceOf[MaterialIconsName]
  @inline def PAUSE = "pause".asInstanceOf[MaterialIconsName]
  @inline def PAUSE_CIRCLE_FILLED =
    "pause-circle-filled".asInstanceOf[MaterialIconsName]
  @inline def PAUSE_CIRCLE_OUTLINE =
    "pause-circle-outline".asInstanceOf[MaterialIconsName]
  @inline def PAYMENT = "payment".asInstanceOf[MaterialIconsName]
  @inline def PEOPLE = "people".asInstanceOf[MaterialIconsName]
  @inline def PEOPLE_OUTLINE = "people-outline".asInstanceOf[MaterialIconsName]
  @inline def PERM_CAMERA_MIC =
    "perm-camera-mic".asInstanceOf[MaterialIconsName]
  @inline def PERM_CONTACT_CALENDAR =
    "perm-contact-calendar".asInstanceOf[MaterialIconsName]
  @inline def PERM_DATA_SETTING =
    "perm-data-setting".asInstanceOf[MaterialIconsName]
  @inline def PERM_DEVICE_INFORMATION =
    "perm-device-information".asInstanceOf[MaterialIconsName]
  @inline def PERM_IDENTITY = "perm-identity".asInstanceOf[MaterialIconsName]
  @inline def PERM_MEDIA = "perm-media".asInstanceOf[MaterialIconsName]
  @inline def PERM_PHONE_MSG = "perm-phone-msg".asInstanceOf[MaterialIconsName]
  @inline def PERM_SCAN_WIFI = "perm-scan-wifi".asInstanceOf[MaterialIconsName]
  @inline def PERSON = "person".asInstanceOf[MaterialIconsName]
  @inline def PERSON_ADD = "person-add".asInstanceOf[MaterialIconsName]
  @inline def PERSON_OUTLINE = "person-outline".asInstanceOf[MaterialIconsName]
  @inline def PERSON_PIN = "person-pin".asInstanceOf[MaterialIconsName]
  @inline def PERSON_PIN_CIRCLE =
    "person-pin-circle".asInstanceOf[MaterialIconsName]
  @inline def PERSONAL_VIDEO = "personal-video".asInstanceOf[MaterialIconsName]
  @inline def PETS = "pets".asInstanceOf[MaterialIconsName]
  @inline def PHONE = "phone".asInstanceOf[MaterialIconsName]
  @inline def PHONE_ANDROID = "phone-android".asInstanceOf[MaterialIconsName]
  @inline def PHONE_BLUETOOTH_SPEAKER =
    "phone-bluetooth-speaker".asInstanceOf[MaterialIconsName]
  @inline def PHONE_FORWARDED =
    "phone-forwarded".asInstanceOf[MaterialIconsName]
  @inline def PHONE_IN_TALK = "phone-in-talk".asInstanceOf[MaterialIconsName]
  @inline def PHONE_IPHONE = "phone-iphone".asInstanceOf[MaterialIconsName]
  @inline def PHONE_LOCKED = "phone-locked".asInstanceOf[MaterialIconsName]
  @inline def PHONE_MISSED = "phone-missed".asInstanceOf[MaterialIconsName]
  @inline def PHONE_PAUSED = "phone-paused".asInstanceOf[MaterialIconsName]
  @inline def PHONELINK = "phonelink".asInstanceOf[MaterialIconsName]
  @inline def PHONELINK_ERASE =
    "phonelink-erase".asInstanceOf[MaterialIconsName]
  @inline def PHONELINK_LOCK = "phonelink-lock".asInstanceOf[MaterialIconsName]
  @inline def PHONELINK_OFF = "phonelink-off".asInstanceOf[MaterialIconsName]
  @inline def PHONELINK_RING = "phonelink-ring".asInstanceOf[MaterialIconsName]
  @inline def PHONELINK_SETUP =
    "phonelink-setup".asInstanceOf[MaterialIconsName]
  @inline def PHOTO = "photo".asInstanceOf[MaterialIconsName]
  @inline def PHOTO_ALBUM = "photo-album".asInstanceOf[MaterialIconsName]
  @inline def PHOTO_CAMERA = "photo-camera".asInstanceOf[MaterialIconsName]
  @inline def PHOTO_FILTER = "photo-filter".asInstanceOf[MaterialIconsName]
  @inline def PHOTO_LIBRARY = "photo-library".asInstanceOf[MaterialIconsName]
  @inline def PHOTO_SIZE_SELECT_ACTUAL =
    "photo-size-select-actual".asInstanceOf[MaterialIconsName]
  @inline def PHOTO_SIZE_SELECT_LARGE =
    "photo-size-select-large".asInstanceOf[MaterialIconsName]
  @inline def PHOTO_SIZE_SELECT_SMALL =
    "photo-size-select-small".asInstanceOf[MaterialIconsName]
  @inline def PICTURE_AS_PDF = "picture-as-pdf".asInstanceOf[MaterialIconsName]
  @inline def PICTURE_IN_PICTURE =
    "picture-in-picture".asInstanceOf[MaterialIconsName]
  @inline def PICTURE_IN_PICTURE_ALT =
    "picture-in-picture-alt".asInstanceOf[MaterialIconsName]
  @inline def PIE_CHART = "pie-chart".asInstanceOf[MaterialIconsName]
  @inline def PIE_CHART_OUTLINED =
    "pie-chart-outlined".asInstanceOf[MaterialIconsName]
  @inline def PIN_DROP = "pin-drop".asInstanceOf[MaterialIconsName]
  @inline def PLACE = "place".asInstanceOf[MaterialIconsName]
  @inline def PLAY_ARROW = "play-arrow".asInstanceOf[MaterialIconsName]
  @inline def PLAY_CIRCLE_FILLED =
    "play-circle-filled".asInstanceOf[MaterialIconsName]
  @inline def PLAY_CIRCLE_OUTLINE =
    "play-circle-outline".asInstanceOf[MaterialIconsName]
  @inline def PLAY_FOR_WORK = "play-for-work".asInstanceOf[MaterialIconsName]
  @inline def PLAYLIST_ADD = "playlist-add".asInstanceOf[MaterialIconsName]
  @inline def PLAYLIST_ADD_CHECK =
    "playlist-add-check".asInstanceOf[MaterialIconsName]
  @inline def PLAYLIST_PLAY = "playlist-play".asInstanceOf[MaterialIconsName]
  @inline def PLUS_ONE = "plus-one".asInstanceOf[MaterialIconsName]
  @inline def POLL = "poll".asInstanceOf[MaterialIconsName]
  @inline def POLYMER = "polymer".asInstanceOf[MaterialIconsName]
  @inline def POOL = "pool".asInstanceOf[MaterialIconsName]
  @inline def PORTABLE_WIFI_OFF =
    "portable-wifi-off".asInstanceOf[MaterialIconsName]
  @inline def PORTRAIT = "portrait".asInstanceOf[MaterialIconsName]
  @inline def POWER = "power".asInstanceOf[MaterialIconsName]
  @inline def POWER_INPUT = "power-input".asInstanceOf[MaterialIconsName]
  @inline def POWER_SETTINGS_NEW =
    "power-settings-new".asInstanceOf[MaterialIconsName]
  @inline def PREGNANT_WOMAN = "pregnant-woman".asInstanceOf[MaterialIconsName]
  @inline def PRESENT_TO_ALL = "present-to-all".asInstanceOf[MaterialIconsName]
  @inline def PRINT = "print".asInstanceOf[MaterialIconsName]
  @inline def PRIORITY_HIGH = "priority-high".asInstanceOf[MaterialIconsName]
  @inline def PUBLIC = "public".asInstanceOf[MaterialIconsName]
  @inline def PUBLISH = "publish".asInstanceOf[MaterialIconsName]
  @inline def QUERY_BUILDER = "query-builder".asInstanceOf[MaterialIconsName]
  @inline def QUESTION_ANSWER =
    "question-answer".asInstanceOf[MaterialIconsName]
  @inline def QUEUE = "queue".asInstanceOf[MaterialIconsName]
  @inline def QUEUE_MUSIC = "queue-music".asInstanceOf[MaterialIconsName]
  @inline def QUEUE_PLAY_NEXT =
    "queue-play-next".asInstanceOf[MaterialIconsName]
  @inline def RADIO = "radio".asInstanceOf[MaterialIconsName]
  @inline def RADIO_BUTTON_CHECKED =
    "radio-button-checked".asInstanceOf[MaterialIconsName]
  @inline def RADIO_BUTTON_UNCHECKED =
    "radio-button-unchecked".asInstanceOf[MaterialIconsName]
  @inline def RATE_REVIEW = "rate-review".asInstanceOf[MaterialIconsName]
  @inline def RECEIPT = "receipt".asInstanceOf[MaterialIconsName]
  @inline def RECENT_ACTORS = "recent-actors".asInstanceOf[MaterialIconsName]
  @inline def RECORD_VOICE_OVER =
    "record-voice-over".asInstanceOf[MaterialIconsName]
  @inline def REDEEM = "redeem".asInstanceOf[MaterialIconsName]
  @inline def REDO = "redo".asInstanceOf[MaterialIconsName]
  @inline def REFRESH = "refresh".asInstanceOf[MaterialIconsName]
  @inline def REMOVE = "remove".asInstanceOf[MaterialIconsName]
  @inline def REMOVE_CIRCLE = "remove-circle".asInstanceOf[MaterialIconsName]
  @inline def REMOVE_CIRCLE_OUTLINE =
    "remove-circle-outline".asInstanceOf[MaterialIconsName]
  @inline def REMOVE_FROM_QUEUE =
    "remove-from-queue".asInstanceOf[MaterialIconsName]
  @inline def REMOVE_RED_EYE = "remove-red-eye".asInstanceOf[MaterialIconsName]
  @inline def REMOVE_SHOPPING_CART =
    "remove-shopping-cart".asInstanceOf[MaterialIconsName]
  @inline def REORDER = "reorder".asInstanceOf[MaterialIconsName]
  @inline def REPEAT = "repeat".asInstanceOf[MaterialIconsName]
  @inline def REPEAT_ONE = "repeat-one".asInstanceOf[MaterialIconsName]
  @inline def REPLAY = "replay".asInstanceOf[MaterialIconsName]
  @inline def REPLAY_10 = "replay-10".asInstanceOf[MaterialIconsName]
  @inline def REPLAY_30 = "replay-30".asInstanceOf[MaterialIconsName]
  @inline def REPLAY_5 = "replay-5".asInstanceOf[MaterialIconsName]
  @inline def REPLY = "reply".asInstanceOf[MaterialIconsName]
  @inline def REPLY_ALL = "reply-all".asInstanceOf[MaterialIconsName]
  @inline def REPORT = "report".asInstanceOf[MaterialIconsName]
  @inline def REPORT_PROBLEM = "report-problem".asInstanceOf[MaterialIconsName]
  @inline def RESTAURANT = "restaurant".asInstanceOf[MaterialIconsName]
  @inline def RESTAURANT_MENU =
    "restaurant-menu".asInstanceOf[MaterialIconsName]
  @inline def RESTORE = "restore".asInstanceOf[MaterialIconsName]
  @inline def RESTORE_PAGE = "restore-page".asInstanceOf[MaterialIconsName]
  @inline def RING_VOLUME = "ring-volume".asInstanceOf[MaterialIconsName]
  @inline def ROOM = "room".asInstanceOf[MaterialIconsName]
  @inline def ROOM_SERVICE = "room-service".asInstanceOf[MaterialIconsName]
  @inline def ROTATE_90_DEGREES_CCW =
    "rotate-90-degrees-ccw".asInstanceOf[MaterialIconsName]
  @inline def ROTATE_LEFT = "rotate-left".asInstanceOf[MaterialIconsName]
  @inline def ROTATE_RIGHT = "rotate-right".asInstanceOf[MaterialIconsName]
  @inline def ROUNDED_CORNER = "rounded-corner".asInstanceOf[MaterialIconsName]
  @inline def ROUTER = "router".asInstanceOf[MaterialIconsName]
  @inline def ROWING = "rowing".asInstanceOf[MaterialIconsName]
  @inline def RSS_FEED = "rss-feed".asInstanceOf[MaterialIconsName]
  @inline def RV_HOOKUP = "rv-hookup".asInstanceOf[MaterialIconsName]
  @inline def SATELLITE = "satellite".asInstanceOf[MaterialIconsName]
  @inline def SAVE = "save".asInstanceOf[MaterialIconsName]
  @inline def SCANNER = "scanner".asInstanceOf[MaterialIconsName]
  @inline def SCHEDULE = "schedule".asInstanceOf[MaterialIconsName]
  @inline def SCHOOL = "school".asInstanceOf[MaterialIconsName]
  @inline def SCREEN_LOCK_LANDSCAPE =
    "screen-lock-landscape".asInstanceOf[MaterialIconsName]
  @inline def SCREEN_LOCK_PORTRAIT =
    "screen-lock-portrait".asInstanceOf[MaterialIconsName]
  @inline def SCREEN_LOCK_ROTATION =
    "screen-lock-rotation".asInstanceOf[MaterialIconsName]
  @inline def SCREEN_ROTATION =
    "screen-rotation".asInstanceOf[MaterialIconsName]
  @inline def SCREEN_SHARE = "screen-share".asInstanceOf[MaterialIconsName]
  @inline def SD_CARD = "sd-card".asInstanceOf[MaterialIconsName]
  @inline def SD_STORAGE = "sd-storage".asInstanceOf[MaterialIconsName]
  @inline def SEARCH = "search".asInstanceOf[MaterialIconsName]
  @inline def SECURITY = "security".asInstanceOf[MaterialIconsName]
  @inline def SELECT_ALL = "select-all".asInstanceOf[MaterialIconsName]
  @inline def SEND = "send".asInstanceOf[MaterialIconsName]
  @inline def SENTIMENT_DISSATISFIED =
    "sentiment-dissatisfied".asInstanceOf[MaterialIconsName]
  @inline def SENTIMENT_NEUTRAL =
    "sentiment-neutral".asInstanceOf[MaterialIconsName]
  @inline def SENTIMENT_SATISFIED =
    "sentiment-satisfied".asInstanceOf[MaterialIconsName]
  @inline def SENTIMENT_VERY_DISSATISFIED =
    "sentiment-very-dissatisfied".asInstanceOf[MaterialIconsName]
  @inline def SENTIMENT_VERY_SATISFIED =
    "sentiment-very-satisfied".asInstanceOf[MaterialIconsName]
  @inline def SETTINGS = "settings".asInstanceOf[MaterialIconsName]
  @inline def SETTINGS_APPLICATIONS =
    "settings-applications".asInstanceOf[MaterialIconsName]
  @inline def SETTINGS_BACKUP_RESTORE =
    "settings-backup-restore".asInstanceOf[MaterialIconsName]
  @inline def SETTINGS_BLUETOOTH =
    "settings-bluetooth".asInstanceOf[MaterialIconsName]
  @inline def SETTINGS_BRIGHTNESS =
    "settings-brightness".asInstanceOf[MaterialIconsName]
  @inline def SETTINGS_CELL = "settings-cell".asInstanceOf[MaterialIconsName]
  @inline def SETTINGS_ETHERNET =
    "settings-ethernet".asInstanceOf[MaterialIconsName]
  @inline def SETTINGS_INPUT_ANTENNA =
    "settings-input-antenna".asInstanceOf[MaterialIconsName]
  @inline def SETTINGS_INPUT_COMPONENT =
    "settings-input-component".asInstanceOf[MaterialIconsName]
  @inline def SETTINGS_INPUT_COMPOSITE =
    "settings-input-composite".asInstanceOf[MaterialIconsName]
  @inline def SETTINGS_INPUT_HDMI =
    "settings-input-hdmi".asInstanceOf[MaterialIconsName]
  @inline def SETTINGS_INPUT_SVIDEO =
    "settings-input-svideo".asInstanceOf[MaterialIconsName]
  @inline def SETTINGS_OVERSCAN =
    "settings-overscan".asInstanceOf[MaterialIconsName]
  @inline def SETTINGS_PHONE = "settings-phone".asInstanceOf[MaterialIconsName]
  @inline def SETTINGS_POWER = "settings-power".asInstanceOf[MaterialIconsName]
  @inline def SETTINGS_REMOTE =
    "settings-remote".asInstanceOf[MaterialIconsName]
  @inline def SETTINGS_SYSTEM_DAYDREAM =
    "settings-system-daydream".asInstanceOf[MaterialIconsName]
  @inline def SETTINGS_VOICE = "settings-voice".asInstanceOf[MaterialIconsName]
  @inline def SHARE = "share".asInstanceOf[MaterialIconsName]
  @inline def SHOP = "shop".asInstanceOf[MaterialIconsName]
  @inline def SHOP_TWO = "shop-two".asInstanceOf[MaterialIconsName]
  @inline def SHOPPING_BASKET =
    "shopping-basket".asInstanceOf[MaterialIconsName]
  @inline def SHOPPING_CART = "shopping-cart".asInstanceOf[MaterialIconsName]
  @inline def SHORT_TEXT = "short-text".asInstanceOf[MaterialIconsName]
  @inline def SHOW_CHART = "show-chart".asInstanceOf[MaterialIconsName]
  @inline def SHUFFLE = "shuffle".asInstanceOf[MaterialIconsName]
  @inline def SIGNAL_CELLULAR_4_BAR =
    "signal-cellular-4-bar".asInstanceOf[MaterialIconsName]
  @inline def SIGNAL_CELLULAR_CONNECTED_NO_INTERNET_4_BAR =
    "signal-cellular-connected-no-internet-4-bar"
      .asInstanceOf[MaterialIconsName]
  @inline def SIGNAL_CELLULAR_NO_SIM =
    "signal-cellular-no-sim".asInstanceOf[MaterialIconsName]
  @inline def SIGNAL_CELLULAR_NULL =
    "signal-cellular-null".asInstanceOf[MaterialIconsName]
  @inline def SIGNAL_CELLULAR_OFF =
    "signal-cellular-off".asInstanceOf[MaterialIconsName]
  @inline def SIGNAL_WIFI_4_BAR =
    "signal-wifi-4-bar".asInstanceOf[MaterialIconsName]
  @inline def SIGNAL_WIFI_4_BAR_LOCK =
    "signal-wifi-4-bar-lock".asInstanceOf[MaterialIconsName]
  @inline def SIGNAL_WIFI_OFF =
    "signal-wifi-off".asInstanceOf[MaterialIconsName]
  @inline def SIM_CARD = "sim-card".asInstanceOf[MaterialIconsName]
  @inline def SIM_CARD_ALERT = "sim-card-alert".asInstanceOf[MaterialIconsName]
  @inline def SKIP_NEXT = "skip-next".asInstanceOf[MaterialIconsName]
  @inline def SKIP_PREVIOUS = "skip-previous".asInstanceOf[MaterialIconsName]
  @inline def SLIDESHOW = "slideshow".asInstanceOf[MaterialIconsName]
  @inline def SLOW_MOTION_VIDEO =
    "slow-motion-video".asInstanceOf[MaterialIconsName]
  @inline def SMARTPHONE = "smartphone".asInstanceOf[MaterialIconsName]
  @inline def SMOKE_FREE = "smoke-free".asInstanceOf[MaterialIconsName]
  @inline def SMOKING_ROOMS = "smoking-rooms".asInstanceOf[MaterialIconsName]
  @inline def SMS = "sms".asInstanceOf[MaterialIconsName]
  @inline def SMS_FAILED = "sms-failed".asInstanceOf[MaterialIconsName]
  @inline def SNOOZE = "snooze".asInstanceOf[MaterialIconsName]
  @inline def SORT = "sort".asInstanceOf[MaterialIconsName]
  @inline def SORT_BY_ALPHA = "sort-by-alpha".asInstanceOf[MaterialIconsName]
  @inline def SPA = "spa".asInstanceOf[MaterialIconsName]
  @inline def SPACE_BAR = "space-bar".asInstanceOf[MaterialIconsName]
  @inline def SPEAKER = "speaker".asInstanceOf[MaterialIconsName]
  @inline def SPEAKER_GROUP = "speaker-group".asInstanceOf[MaterialIconsName]
  @inline def SPEAKER_NOTES = "speaker-notes".asInstanceOf[MaterialIconsName]
  @inline def SPEAKER_NOTES_OFF =
    "speaker-notes-off".asInstanceOf[MaterialIconsName]
  @inline def SPEAKER_PHONE = "speaker-phone".asInstanceOf[MaterialIconsName]
  @inline def SPELLCHECK = "spellcheck".asInstanceOf[MaterialIconsName]
  @inline def STAR = "star".asInstanceOf[MaterialIconsName]
  @inline def STAR_BORDER = "star-border".asInstanceOf[MaterialIconsName]
  @inline def STAR_HALF = "star-half".asInstanceOf[MaterialIconsName]
  @inline def STARS = "stars".asInstanceOf[MaterialIconsName]
  @inline def STAY_CURRENT_LANDSCAPE =
    "stay-current-landscape".asInstanceOf[MaterialIconsName]
  @inline def STAY_CURRENT_PORTRAIT =
    "stay-current-portrait".asInstanceOf[MaterialIconsName]
  @inline def STAY_PRIMARY_LANDSCAPE =
    "stay-primary-landscape".asInstanceOf[MaterialIconsName]
  @inline def STAY_PRIMARY_PORTRAIT =
    "stay-primary-portrait".asInstanceOf[MaterialIconsName]
  @inline def STOP = "stop".asInstanceOf[MaterialIconsName]
  @inline def STOP_SCREEN_SHARE =
    "stop-screen-share".asInstanceOf[MaterialIconsName]
  @inline def STORAGE = "storage".asInstanceOf[MaterialIconsName]
  @inline def STORE = "store".asInstanceOf[MaterialIconsName]
  @inline def STORE_MALL_DIRECTORY =
    "store-mall-directory".asInstanceOf[MaterialIconsName]
  @inline def STRAIGHTEN = "straighten".asInstanceOf[MaterialIconsName]
  @inline def STREETVIEW = "streetview".asInstanceOf[MaterialIconsName]
  @inline def STRIKETHROUGH_S =
    "strikethrough-s".asInstanceOf[MaterialIconsName]
  @inline def STYLE = "style".asInstanceOf[MaterialIconsName]
  @inline def SUBDIRECTORY_ARROW_LEFT =
    "subdirectory-arrow-left".asInstanceOf[MaterialIconsName]
  @inline def SUBDIRECTORY_ARROW_RIGHT =
    "subdirectory-arrow-right".asInstanceOf[MaterialIconsName]
  @inline def SUBJECT = "subject".asInstanceOf[MaterialIconsName]
  @inline def SUBSCRIPTIONS = "subscriptions".asInstanceOf[MaterialIconsName]
  @inline def SUBTITLES = "subtitles".asInstanceOf[MaterialIconsName]
  @inline def SUBWAY = "subway".asInstanceOf[MaterialIconsName]
  @inline def SUPERVISOR_ACCOUNT =
    "supervisor-account".asInstanceOf[MaterialIconsName]
  @inline def SURROUND_SOUND = "surround-sound".asInstanceOf[MaterialIconsName]
  @inline def SWAP_CALLS = "swap-calls".asInstanceOf[MaterialIconsName]
  @inline def SWAP_HORIZ = "swap-horiz".asInstanceOf[MaterialIconsName]
  @inline def SWAP_VERT = "swap-vert".asInstanceOf[MaterialIconsName]
  @inline def SWAP_VERTICAL_CIRCLE =
    "swap-vertical-circle".asInstanceOf[MaterialIconsName]
  @inline def SWITCH_CAMERA = "switch-camera".asInstanceOf[MaterialIconsName]
  @inline def SWITCH_VIDEO = "switch-video".asInstanceOf[MaterialIconsName]
  @inline def SYNC = "sync".asInstanceOf[MaterialIconsName]
  @inline def SYNC_DISABLED = "sync-disabled".asInstanceOf[MaterialIconsName]
  @inline def SYNC_PROBLEM = "sync-problem".asInstanceOf[MaterialIconsName]
  @inline def SYSTEM_UPDATE = "system-update".asInstanceOf[MaterialIconsName]
  @inline def SYSTEM_UPDATE_ALT =
    "system-update-alt".asInstanceOf[MaterialIconsName]
  @inline def TAB = "tab".asInstanceOf[MaterialIconsName]
  @inline def TAB_UNSELECTED = "tab-unselected".asInstanceOf[MaterialIconsName]
  @inline def TABLET = "tablet".asInstanceOf[MaterialIconsName]
  @inline def TABLET_ANDROID = "tablet-android".asInstanceOf[MaterialIconsName]
  @inline def TABLET_MAC = "tablet-mac".asInstanceOf[MaterialIconsName]
  @inline def TAG_FACES = "tag-faces".asInstanceOf[MaterialIconsName]
  @inline def TAP_AND_PLAY = "tap-and-play".asInstanceOf[MaterialIconsName]
  @inline def TERRAIN = "terrain".asInstanceOf[MaterialIconsName]
  @inline def TEXT_FIELDS = "text-fields".asInstanceOf[MaterialIconsName]
  @inline def TEXT_FORMAT = "text-format".asInstanceOf[MaterialIconsName]
  @inline def TEXTSMS = "textsms".asInstanceOf[MaterialIconsName]
  @inline def TEXTURE = "texture".asInstanceOf[MaterialIconsName]
  @inline def THEATERS = "theaters".asInstanceOf[MaterialIconsName]
  @inline def THUMB_DOWN = "thumb-down".asInstanceOf[MaterialIconsName]
  @inline def THUMB_UP = "thumb-up".asInstanceOf[MaterialIconsName]
  @inline def THUMBS_UP_DOWN = "thumbs-up-down".asInstanceOf[MaterialIconsName]
  @inline def TIME_TO_LEAVE = "time-to-leave".asInstanceOf[MaterialIconsName]
  @inline def TIMELAPSE = "timelapse".asInstanceOf[MaterialIconsName]
  @inline def TIMELINE = "timeline".asInstanceOf[MaterialIconsName]
  @inline def TIMER = "timer".asInstanceOf[MaterialIconsName]
  @inline def TIMER_10 = "timer-10".asInstanceOf[MaterialIconsName]
  @inline def TIMER_3 = "timer-3".asInstanceOf[MaterialIconsName]
  @inline def TIMER_OFF = "timer-off".asInstanceOf[MaterialIconsName]
  @inline def TITLE = "title".asInstanceOf[MaterialIconsName]
  @inline def TOC = "toc".asInstanceOf[MaterialIconsName]
  @inline def TODAY = "today".asInstanceOf[MaterialIconsName]
  @inline def TOLL = "toll".asInstanceOf[MaterialIconsName]
  @inline def TONALITY = "tonality".asInstanceOf[MaterialIconsName]
  @inline def TOUCH_APP = "touch-app".asInstanceOf[MaterialIconsName]
  @inline def TOYS = "toys".asInstanceOf[MaterialIconsName]
  @inline def TRACK_CHANGES = "track-changes".asInstanceOf[MaterialIconsName]
  @inline def TRAFFIC = "traffic".asInstanceOf[MaterialIconsName]
  @inline def TRAIN = "train".asInstanceOf[MaterialIconsName]
  @inline def TRAM = "tram".asInstanceOf[MaterialIconsName]
  @inline def TRANSFER_WITHIN_A_STATION =
    "transfer-within-a-station".asInstanceOf[MaterialIconsName]
  @inline def TRANSFORM = "transform".asInstanceOf[MaterialIconsName]
  @inline def TRANSLATE = "translate".asInstanceOf[MaterialIconsName]
  @inline def TRENDING_DOWN = "trending-down".asInstanceOf[MaterialIconsName]
  @inline def TRENDING_FLAT = "trending-flat".asInstanceOf[MaterialIconsName]
  @inline def TRENDING_UP = "trending-up".asInstanceOf[MaterialIconsName]
  @inline def TUNE = "tune".asInstanceOf[MaterialIconsName]
  @inline def TURNED_IN = "turned-in".asInstanceOf[MaterialIconsName]
  @inline def TURNED_IN_NOT = "turned-in-not".asInstanceOf[MaterialIconsName]
  @inline def TV = "tv".asInstanceOf[MaterialIconsName]
  @inline def UNARCHIVE = "unarchive".asInstanceOf[MaterialIconsName]
  @inline def UNDO = "undo".asInstanceOf[MaterialIconsName]
  @inline def UNFOLD_LESS = "unfold-less".asInstanceOf[MaterialIconsName]
  @inline def UNFOLD_MORE = "unfold-more".asInstanceOf[MaterialIconsName]
  @inline def UPDATE = "update".asInstanceOf[MaterialIconsName]
  @inline def USB = "usb".asInstanceOf[MaterialIconsName]
  @inline def VERIFIED_USER = "verified-user".asInstanceOf[MaterialIconsName]
  @inline def VERTICAL_ALIGN_BOTTOM =
    "vertical-align-bottom".asInstanceOf[MaterialIconsName]
  @inline def VERTICAL_ALIGN_CENTER =
    "vertical-align-center".asInstanceOf[MaterialIconsName]
  @inline def VERTICAL_ALIGN_TOP =
    "vertical-align-top".asInstanceOf[MaterialIconsName]
  @inline def VIBRATION = "vibration".asInstanceOf[MaterialIconsName]
  @inline def VIDEO_CALL = "video-call".asInstanceOf[MaterialIconsName]
  @inline def VIDEO_LABEL = "video-label".asInstanceOf[MaterialIconsName]
  @inline def VIDEO_LIBRARY = "video-library".asInstanceOf[MaterialIconsName]
  @inline def VIDEOCAM = "videocam".asInstanceOf[MaterialIconsName]
  @inline def VIDEOCAM_OFF = "videocam-off".asInstanceOf[MaterialIconsName]
  @inline def VIDEOGAME_ASSET =
    "videogame-asset".asInstanceOf[MaterialIconsName]
  @inline def VIEW_AGENDA = "view-agenda".asInstanceOf[MaterialIconsName]
  @inline def VIEW_ARRAY = "view-array".asInstanceOf[MaterialIconsName]
  @inline def VIEW_CAROUSEL = "view-carousel".asInstanceOf[MaterialIconsName]
  @inline def VIEW_COLUMN = "view-column".asInstanceOf[MaterialIconsName]
  @inline def VIEW_COMFY = "view-comfy".asInstanceOf[MaterialIconsName]
  @inline def VIEW_COMPACT = "view-compact".asInstanceOf[MaterialIconsName]
  @inline def VIEW_DAY = "view-day".asInstanceOf[MaterialIconsName]
  @inline def VIEW_HEADLINE = "view-headline".asInstanceOf[MaterialIconsName]
  @inline def VIEW_LIST = "view-list".asInstanceOf[MaterialIconsName]
  @inline def VIEW_MODULE = "view-module".asInstanceOf[MaterialIconsName]
  @inline def VIEW_QUILT = "view-quilt".asInstanceOf[MaterialIconsName]
  @inline def VIEW_STREAM = "view-stream".asInstanceOf[MaterialIconsName]
  @inline def VIEW_WEEK = "view-week".asInstanceOf[MaterialIconsName]
  @inline def VIGNETTE = "vignette".asInstanceOf[MaterialIconsName]
  @inline def VISIBILITY = "visibility".asInstanceOf[MaterialIconsName]
  @inline def VISIBILITY_OFF = "visibility-off".asInstanceOf[MaterialIconsName]
  @inline def VOICE_CHAT = "voice-chat".asInstanceOf[MaterialIconsName]
  @inline def VOICEMAIL = "voicemail".asInstanceOf[MaterialIconsName]
  @inline def VOLUME_DOWN = "volume-down".asInstanceOf[MaterialIconsName]
  @inline def VOLUME_MUTE = "volume-mute".asInstanceOf[MaterialIconsName]
  @inline def VOLUME_OFF = "volume-off".asInstanceOf[MaterialIconsName]
  @inline def VOLUME_UP = "volume-up".asInstanceOf[MaterialIconsName]
  @inline def VPN_KEY = "vpn-key".asInstanceOf[MaterialIconsName]
  @inline def VPN_LOCK = "vpn-lock".asInstanceOf[MaterialIconsName]
  @inline def WALLPAPER = "wallpaper".asInstanceOf[MaterialIconsName]
  @inline def WARNING = "warning".asInstanceOf[MaterialIconsName]
  @inline def WATCH = "watch".asInstanceOf[MaterialIconsName]
  @inline def WATCH_LATER = "watch-later".asInstanceOf[MaterialIconsName]
  @inline def WB_AUTO = "wb-auto".asInstanceOf[MaterialIconsName]
  @inline def WB_CLOUDY = "wb-cloudy".asInstanceOf[MaterialIconsName]
  @inline def WB_INCANDESCENT =
    "wb-incandescent".asInstanceOf[MaterialIconsName]
  @inline def WB_IRIDESCENT = "wb-iridescent".asInstanceOf[MaterialIconsName]
  @inline def WB_SUNNY = "wb-sunny".asInstanceOf[MaterialIconsName]
  @inline def WC = "wc".asInstanceOf[MaterialIconsName]
  @inline def WEB = "web".asInstanceOf[MaterialIconsName]
  @inline def WEB_ASSET = "web-asset".asInstanceOf[MaterialIconsName]
  @inline def WEEKEND = "weekend".asInstanceOf[MaterialIconsName]
  @inline def WHATSHOT = "whatshot".asInstanceOf[MaterialIconsName]
  @inline def WIDGETS = "widgets".asInstanceOf[MaterialIconsName]
  @inline def WIFI = "wifi".asInstanceOf[MaterialIconsName]
  @inline def WIFI_LOCK = "wifi-lock".asInstanceOf[MaterialIconsName]
  @inline def WIFI_TETHERING = "wifi-tethering".asInstanceOf[MaterialIconsName]
  @inline def WORK = "work".asInstanceOf[MaterialIconsName]
  @inline def WRAP_TEXT = "wrap-text".asInstanceOf[MaterialIconsName]
  @inline def YOUTUBE_SEARCHED_FOR =
    "youtube-searched-for".asInstanceOf[MaterialIconsName]
  @inline def ZOOM_IN = "zoom-in".asInstanceOf[MaterialIconsName]
  @inline def ZOOM_OUT = "zoom-out".asInstanceOf[MaterialIconsName]
  @inline def ZOOM_OUT_MAP = "zoom-out-map".asInstanceOf[MaterialIconsName]
}