// CREDITS: These types are based on the original work made by all the people who contributed to @types/react-native

import * as React from 'react';
import * as ReactNative from 'react-native';

interface FadingEdgeProps extends ReactNative.ViewProps {
  top: number;
  left: number;
  bottom: number;
  right: number;
}
/**
 * @see https://github.com/KusStar/react-native-fading-edge
 */
declare class FadingEdgeComponent extends React.Component<FadingEdgeProps> {}
declare const FadingEdgeBase: ReactNative.Constructor<
  ReactNative.NativeMethodsMixin
> &
  typeof FadingEdgeComponent;
export default class FadingEdge extends FadingEdgeBase {}
